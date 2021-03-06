package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
	private class Node {
		private String label;
		
		public Node(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return label;
		}
	}
	
	private Map<String, Node> keys = new HashMap<String, Node>();
	private Map<Node, List<Node>> graph = new HashMap<Node, List<Node>>();
	
	public void addNode(String label) {
		Node node = new Node(label);
		
		keys.putIfAbsent(label, node);
		graph.putIfAbsent(node, new LinkedList<Node>());
	}
	
	public void addEdge(String from, String to) {
		if(!keys.containsKey(from) || !keys.containsKey(to))
			throw new IllegalArgumentException();
		
		if(from.equals(to))
			return;

		for(Node n : graph.get(keys.get(from)).toArray(new Node[0])) {
			if(n.toString().equals(to))
				return;
		}
			
		graph.get(keys.get(from)).add(new Node(to));
	}
	
	

	public void print() {
		for(Node node : graph.keySet()) {		
			if(!graph.get(node).isEmpty())
				System.out.println(node+" is connected with "+graph.get(node));
		}	
	}
	
	
	
	
}
