package directedGraph;

import java.util.ArrayList;
import java.util.HashMap;

public class AdjacencyMatrix {
	
	private class Node {
		
		private String label;
		
		public Node(String label) {
			this.label = label;
		}
	}
	
	private int[][] am;
	private int size = 0;
	private HashMap<String, Integer> cat;
	private int index = 0;
	
	public AdjacencyMatrix() {
		
	}
	
	public void addNode(String label) {
		if(cat == null)
			cat = new HashMap<String, Integer>();
		
		if(am == null)
			am = new int[2][2];
		
		if(size == am.length)
			resize();
		
		cat.put(label, index ++);
		size ++;
	}
	
	public void removeNode(String label) {
		if(!cat.containsKey(label))
			return;
		
		for(int i = 0 ; i < size ; i ++) {	
			for(int j = 0 ; j < size ; j ++) {
				if(getKey(i).equals(label) || getKey(j).equals(label))
					am[i][j] = 0;
			}
		}
		
		cat.remove(label);
		size --;
	}

	public void addEdge(String from, String to) {
		if(from.equals(to))
			return;
		
		am[cat.get(from)][cat.get(to)] = 1;
	}
	
	public void removeEdge(String from, String to) {
		if(from.equals(to))
			return;
		
		am[cat.get(from)][cat.get(to)] = 0;
	}

	private void resize() {
		int[][] temp = new int[size * 2][size * 2];
		
		for(int i = 0 ; i < size ; i ++)	
			for(int j = 0 ; j < size ; j ++)
				temp[i][j] = am[i][j];
		
		am = temp;
	}
	
	public void print() {
		ArrayList<String> list;
		for(int i = 0 ; i < size ; i ++) {	
			list = new ArrayList<String>();
			
			for(int j = 0 ; j < size ; j ++) {
				if(am[i][j] == 1)
					list.add(getKey(j));
			}
				
			if(!list.isEmpty())
				System.out.println(getKey(i)+" is connected with "+list.toString());			
		}
	}
	
	private String getKey(int index) {
		int i = 0;
		for(String s : cat.keySet())
			if(index == i ++)
				return s;
		
		return null;
	}			
			
	public void test() {
		for(int i = 0 ; i < size ; i ++) {	
			for(int j = 0 ; j < size ; j ++)
				System.out.print(am[i][j]+" ");
		System.out.println();
		}
		System.out.println("------");
	}

}
