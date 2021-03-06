package arrayTrie;

public class ArrayTrie {
	private static int ALPHABET_SIZE = 26;
	
	private class Node{
		private char value;
		private Node[] child = new Node[ALPHABET_SIZE];
		private boolean isEndOfWord = false;
		
		public Node(char value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "value= " + value;
		}
 	}
	
	private Node root = new Node(Character.MIN_VALUE);
	private Node nodeCurrent;
	
	public void insert(String str) {
		nodeCurrent = root;

		for(char ch : str.toCharArray()) {
			if(notDuplicated(ch))
				addNode(ch);
			forwardToNext(ch);
		}

		nodeCurrent.isEndOfWord = true;
	}
	
	public boolean contains(String str) {
		if(str == null)
			return false;
		
		nodeCurrent = root;
		
		for(char ch : str.toCharArray()) {
			if(notDuplicated(ch))
				return false;
			forwardToNext(ch);
		}

		return isEndOfWord();
	}			
	
	public void traverse() {
		traverse(root);
	}
	
	private void traverse(Node root) {
		for(Node node : root.child) {
			if(node == null)
				continue;
			System.out.println(node);
			traverse(node);
		}
	}

	private int index(char ch) {
		return ch - 'a';
	}
	
	private boolean notDuplicated(char ch) {
		return nodeCurrent.child[index(ch)] == null;
	}
	
	private void addNode(char ch) {
		nodeCurrent.child[index(ch)] = new Node(ch);
	}
	
	private void forwardToNext(char ch) {
		nodeCurrent = nodeCurrent.child[index(ch)];
	}
	
	private boolean isEndOfWord() {
		return nodeCurrent.isEndOfWord == true;
	}
	
}
