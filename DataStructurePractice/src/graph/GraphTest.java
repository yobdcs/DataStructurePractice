package graph;

public class GraphTest {

	public static void main(String[] args) {
		
//		AdjacencyMatrix g = new AdjacencyMatrix();
		AdjacencyList g = new AdjacencyList();

//		g.addNode("A");
//		g.addNode("B");
//		g.addNode("C");
//		g.addNode("D");
//		g.addEdge("A","B");
//		g.addEdge("A","C");
//		g.addEdge("B","D");
//		g.addEdge("D","C");
		
		g.addNode("X");
		g.addNode("A");
		g.addNode("B");
		g.addNode("P");
		g.addEdge("X", "A");
		g.addEdge("X", "B");
		g.addEdge("A", "P");
		g.addEdge("B", "P");
		
//		g.removeEdge("C", "B");
//		g.removeNode("D");
		
//		g.test();
		g.print();
		
		System.out.println("----------");
//		g.dfsRecursive("A");
//		g.dfsIterative("A");
//		g.bfsIterative("X");
		
		
	}

}
