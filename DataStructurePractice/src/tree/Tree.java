package tree;

public class Tree {

	private class Node{
		int value;
		Node leftChild;
		Node rightChild;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node root;
	private Node temp;
	private Node node;
	
	private boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int value) {
		node = new Node(value);
		
		if(isEmpty()) {
			root = node;
			return;
		}
		
		temp = root;
		while(true) {
			if(value > temp.value) {
				if(temp.rightChild == null) {
					temp.rightChild = node;
					return;
				}
				temp = temp.rightChild;
				continue;
			} else if(value < temp.value) {
				if(temp.leftChild == null) {
					temp.leftChild = node;
					return;
				}
				temp = temp.leftChild;
				continue;
			} else
				throw new IllegalStateException();
		}
	}

	public boolean find(int value) {
		if(isEmpty())
			return false;
		
		temp = root;
		while(true) {
			if(value > temp.value) {
				if(temp.rightChild == null)
					return false;
				temp = temp.rightChild;
				continue;
			} else if(value < temp.value) {
				if(temp.leftChild == null)
					return false;
				temp = temp.leftChild;
				continue;
			} else
				return true;
		}
	}

	public void traversePreOrder() {
		traversePreOrder(root);
	}

	private void traversePreOrder(Node root) {
		if(root == null)
			return;
		
		System.out.println(root.value);
		traversePreOrder(root.leftChild);
		traversePreOrder(root.rightChild);		
	}
	
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	
	private void traverseInOrder(Node root) {
		if(root == null)
			return;
		
		traverseInOrder(root.leftChild);
		System.out.println(root.value);
		traverseInOrder(root.rightChild);
		return;
	}
	
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	
	private void traversePostOrder(Node root) {
		if(root == null)
			return;
		
		traversePostOrder(root.leftChild);
		traversePostOrder(root.rightChild);
		System.out.println(root.value);
		return;
	}
	
	public int height() {
		return height(root); 
	}
	
	private int height(Node root) {
		if(root == null)
			return -1;
		
		if(root.leftChild == null && root.rightChild == null)
			return 0;
		
		return 1 + Math.max(height(root.leftChild), height(root.rightChild));
	}
	
	public int min() {
		return min(root);
	}
	
	private int min(Node root) {
		if(root == null)
			throw new IllegalStateException();
		
		Node temp = root;
		while(temp.leftChild != null)
			temp = temp.leftChild;
		
		return temp.value;
	}
	
//	public int minBinaryTree() {
//		return minBinaryTree(root);
//	}
//	
//	private int minBinaryTree(Node root) {
//		if(root.leftChild == null && root.rightChild == null)
//			return root.value;
//		
//		return Math.min(minBinaryTree(root.leftChild) , minBinaryTree(root.rightChild));
//		
//		
//	}
	
	public boolean equals(Tree t2) {
		if(t2 == null)
			return false;
		return equals(root, t2.root);
	}
	
	private boolean equals(Node root, Node root2) {
		if(root == null && root2 != null ||
				root != null && root2 == null)
				return false;
		
		if(root == null && root2 == null)
			return true;
		
		return root.value == root2.value && 
				equals(root.leftChild, root2.leftChild) &&
				equals(root.rightChild, root2.rightChild);	
	}
	
	public boolean equalsPOST(Tree t2) {
		if(t2 == null)
			return false;
		return equalsPOST(root, t2.root);
	}
	
	private boolean equalsPOST(Node root, Node root2) {
		if(root == null && root2 != null ||
			root != null && root2 == null)
			return false;

		if(root == null && root2 == null)
			return true;
		
		return equals(root.leftChild, root2.leftChild) &&
				equals(root.rightChild, root2.rightChild) &&
				root.value == root2.value;
	}
	
	public void NodesAtK(int k) {
		NodesAtK(root, k);
	}
	
	private void NodesAtK(Node root, int k) {
		System.out.println("k : "+k);
		if(root == null)
			return;
		
		NodesAtK(root.leftChild, k - 1);
		NodesAtK(root.rightChild, k - 1);
		if(k == 0)
			System.out.println("value : "+root.value);
		return;   //只做return，不會把-1回傳，上一階k仍維持原值
	}
}
