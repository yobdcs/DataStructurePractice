package tree;

public class TreeTest {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		Tree t2 = new Tree();
//		int[] test = {10, 5, 15, 6, 1, 8, 12, 18, 17};
//		int[] test = {20, 10, 30, 6, 21, 3, 8, 4};
		int[] test = {7, 4, 9, 1, 6, 8, 10};
		int[] test2 = {7, 4, 9, 1, 6, 8, 10};
		
		for(int i : test)
			t.insert(i);
		
		for(int i : test2)
			t2.insert(i);
		
		for(int i = 0 ; i <= 17 ; i++)
			System.out.println(i+" : "+t.find(i));
		
		System.out.println("----------------");
		t.traversePreOrder();
		System.out.println("----------------");
		t.traverseInOrder();
		System.out.println("----------------");
		t.traversePostOrder();
		System.out.println("----------------");
		System.out.println("height of tree : "+t.height());
		System.out.println("----------------");
		System.out.println("min of binary search tree : "+t.min());
//		System.out.println("min of binary tree : "+t.minBinaryTree());
		
		System.out.println("----------------");
		System.out.println("pre-order : "+t.equals(t2));
		System.out.println("post-order : "+t.equalsPOST(t2));
		t.NodesAtK(2);
	}

}
