package directedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class AdjacencyList {

	private class Node {
		
		String label;
		
		public Node(String label) {
			this.label = label;
		}
	}
	
	private List<LinkedList<Node>> graph = new ArrayList<LinkedList<Node>>();
	private Map<String, Integer> vertex = new HashMap<String, Integer>();
	private int vertexAmount = 0;
	
	public void addNode(String str) {
		if(vertex.putIfAbsent(str, vertexAmount) != null)
			return;

		graph.add(new LinkedList<Node>());
		vertexAmount ++;
	}
	
	public void removeNode(String str) {
		if(vertex.get(str) == null)
			return;
		
		boolean flag = false;
		for(String s : vertex.keySet()) {
			removeEdge(s, str);

			if(s.equals(str)) {
				flag = true;
				continue;
			}
			
			if(flag)
				vertex.put(s, vertex.get(s) - 1);
		}	
		graph.remove((int)vertex.get(str));

		vertex.remove(str);
		vertexAmount --;
	}
	
	public void addEdge(String from, String to) {
		for(Node n : graph.get(vertex.get(from))) {
			if(n.label.equals(from))
				return;
		}
		graph.get(vertex.get(from)).add(new Node(to));
	}
	
	public void removeEdge(String from, String to) {
		for(Node n : graph.get(vertex.get(from))) {
			if(n.label.equals(to))
				graph.get(vertex.get(from)).remove(n);
		}	
	}
	
	public void print() {
		List<String> list;
		for(String s : vertex.keySet()) {
			list = new ArrayList<String>();
			for(Node n : graph.get(vertex.get(s)))
				list.add(n.label);
			
		if(list.isEmpty())
			continue;
		
		System.out.println(s + " is connected with " + list);
		}
	}
	
	public void dfsRecursive(String str) {
		dfsRecursive(str, new HashSet<String>());
	}
	
	private void dfsRecursive(String str, Set<String> set) {
		if(set.contains(str) || vertex.get(str) == null)
			return;
		
		System.out.println(str);
		set.add(str);

		if(graph.get(vertex.get(str)).size() != 0) {
			for(Node n : graph.get(vertex.get(str)))
				dfsRecursive(n.label, set);
		}	
	}
	
	public void dfsIterative(String str) {
		if(vertex.get(str) == null)
			return;
		
		Stack<String> stack = new Stack<String>();
		Set<String> set = new HashSet<String>();
		
		stack.push(str);
		while(!stack.isEmpty()) {
			str = stack.pop();
			if(set.contains(str))
				continue;
			
			System.out.println(str);
			set.add(str);
			
			if(graph.get(vertex.get(str)).size() != 0) {
				for(Node n : graph.get(vertex.get(str)))
					stack.push(n.label);
			}
		}
	}
	
	public void bfsIterative(String str) {
		if(vertex.get(str) == null)
			return;
		
		Queue<String> queue = new LinkedList<String>();
		Set<String> set = new HashSet<String>();
		
		queue.add(str);
		while(!queue.isEmpty()) {
			str = queue.poll();
			if(set.contains(str))
				continue;
			
			System.out.println(str);
			set.add(str);
			
			if(graph.get(vertex.get(str)).size() != 0) {
				for(var n : graph.get(vertex.get(str)))
					queue.add(n.label);
			}				
		}
	}
	
	public List<String> topologicalSort(String str) {
		if(vertex.get(str) == null)
			return null;
		
		Stack<String> stack = new Stack<String>();
		List<String> list = new ArrayList<String>();
		
		topologicalSort(str, stack, new HashSet<String>());
		while(!stack.isEmpty())
			list.add(stack.pop());
		
		return list;
	}

	private void topologicalSort(String str, Stack<String> stack, Set<String> set) {
		if(set.contains(str) || vertex.get(str) == null)
			return;
		
		set.add(str);
		
		if(graph.get(vertex.get(str)).size() != 0) {
			for(Node n : graph.get(vertex.get(str)))
				topologicalSort(n.label, stack, set);
		}
		stack.push(str);
	}
	
	public boolean hasCycle() {
		for(String key : vertex.keySet()) {
			if(hasCycle(key, new HashSet<String>(), new HashSet<String>()))
				return true;
		}
		return false;
	}

	private boolean hasCycle(String str, Set<String> visiting, Set<String> visited) {
		if(visiting.contains(str))
			return true;
		
		visiting.add(str);
		
		if(graph.get(vertex.get(str)).size() != 0) {
			for(Node n : graph.get(vertex.get(str))) {
				if(hasCycle(n.label, visiting, visited))
					return true;	
			}
		}
		visited.add(str);
		visiting.remove(str);
		return false;
	}
	
}
