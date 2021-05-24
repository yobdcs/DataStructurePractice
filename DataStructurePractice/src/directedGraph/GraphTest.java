package directedGraph;

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
		
//		-----topological sort test-----
//		g.addNode("X");
//		g.addNode("A");
//		g.addNode("B");
//		g.addNode("C");
//		g.addNode("D");
//		g.addNode("P");
//		g.addEdge("X", "A");
//		g.addEdge("X", "B");
//		g.addEdge("X", "C");
//		g.addEdge("A", "P");
//		g.addEdge("B", "P");
//		g.addEdge("C", "D");
//		g.addEdge("D", "P");
		
//		-----cycle detection test-----
		g.addNode("A");
		g.addNode("B");
		g.addNode("C");
		g.addNode("D");
		g.addEdge("A", "B");
		g.addEdge("B", "C");
		g.addEdge("C", "A");
		g.addEdge("D", "A");
		
//		g.removeEdge("C", "B");
//		g.removeNode("D");
		
//		g.test();
		g.print();
		
		System.out.println("----------");
//		g.dfsRecursive("A");
//		g.dfsIterative("A");
//		g.bfsIterative("X");
		
//		System.out.println("Topological Sort : " + g.topologicalSort("X"));
		
		System.out.println("has cycle? : " + g.hasCycle());
	}

}
