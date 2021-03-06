package graph;

public class GraphTest {

	public static void main(String[] args) {
		
//		AdjacencyMatrix g = new AdjacencyMatrix();
		AdjacencyList g = new AdjacencyList();

		g.addNode("A");
		g.addNode("B");
		g.addNode("C");
		
		g.addEdge("A","B");
		g.addEdge("A","C");
		g.addEdge("B","A");
//		g.removeEdge("A", "B");
		
//		g.removeNode("C");
		
//		g.test();
		g.print();
	}

}
