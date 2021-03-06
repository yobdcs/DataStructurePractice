package AVLTreeRecursion;

public class AVLTree {
	
	private class AVLNode{
		int value;
		int height = 0;
		AVLNode leftChild;
		AVLNode rightChild;
		
		public AVLNode(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "value : " + this.value;
		}
	}
	
	private AVLNode root;
	
	public int height(AVLNode root) {
		return (root == null) ? -1 : root.height;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	private AVLNode insert(AVLNode root, int value){
		if(root == null)
			return new AVLNode(value);
		
		if(value < root.value)
			root.leftChild = insert(root.leftChild, value);
		else if(value > root.value)
			root.rightChild = insert(root.rightChild, value);
		else
			throw new IllegalStateException();
		
		setHeight(root);
		
		return rotation(root);
	}
				
	private AVLNode rotation(AVLNode root) {
		if(isLeftHeavy(root)) {
			if(balanceFactor(root.leftChild) < 0)
				root.leftChild = leftRotation(root.leftChild);
			return rightRotation(root);
		}
		else if(isRightHeavy(root)) {
			if(balanceFactor(root.rightChild) > 0)
				root.rightChild = rightRotation(root.rightChild);
			return leftRotation(root);
		}
		return root;
	}
	
	private AVLNode leftRotation(AVLNode root) {
		AVLNode temp = root;
		root = root.rightChild;

		temp.rightChild = root.leftChild;
		root.leftChild = temp;
		
		setHeight(root);
		setHeight(temp);
		
		return root;
	}
	
	private AVLNode rightRotation(AVLNode root) {
		AVLNode temp = root;
		root = root.leftChild;

		temp.leftChild = root.rightChild;
		root.rightChild = temp;
		
		setHeight(root);
		setHeight(temp);
		
		return root;
	}
	
	private void setHeight(AVLNode root) {
		root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
	}

	private int balanceFactor(AVLNode root) {
		return (root == null) ? 0 : height(root.leftChild) - height(root.rightChild);
	}
	
	private boolean isLeftHeavy(AVLNode root) {
		return balanceFactor(root) > 1;
	}
	
	private boolean isRightHeavy(AVLNode root) {
		return balanceFactor(root) < -1;
	}
	
	
}
