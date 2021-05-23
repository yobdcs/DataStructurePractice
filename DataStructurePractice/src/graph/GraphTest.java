package graph;

public class GraphTest {

	public static void main(String[] args) {
		
//		AdjacencyMatrix g = new AdjacencyMatrix();
		AdjacencyList g = new AdjacencyList();

		g.addNode("A");
		g.addNode("B");
		g.addNode("C");
		g.addNode("D");
		
		g.addEdge("A","B");
		g.addEdge("A","C");
		g.addEdge("B","D");
		g.addEdge("D","C");
//		g.removeEdge("C", "B");
		
//		g.removeNode("D");
		
//		g.test();
		g.print();
		
		System.out.println("----------");
//		g.dfsRecursive("A");
		g.dfsIterative("A");
	}

}
