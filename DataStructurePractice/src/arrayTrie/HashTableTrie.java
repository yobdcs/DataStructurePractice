package arrayTrie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashTableTrie {
	
	private class Node{
		private char value;
		private HashMap<Character, Node> child = new HashMap<Character, Node>();
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
	private int count = 0;
	
	public void insert(String str) {
		nodeCurrent = root;

		for(char ch : str.toCharArray()) {
			if(notDuplicated(ch))
				addNode(ch);	
			forwardToNext(ch);
		}

		nodeCurrent.isEndOfWord = true;
	}
	
	public boolean containsI(String str) {
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
	
	public boolean containsR(String str) {
		if(str == null)
			return false;
	
		return containsR(root, str, 0);
	}
	
	private boolean containsR(Node nodeCurrent, String str, int index) {
		if(nodeCurrent == null)
			return false;
		
		if(index == str.length())
			return nodeCurrent.isEndOfWord;

		return containsR(nodeCurrent.child.get(str.charAt(index)), str, index + 1);	
	}

	public void traversePreOrder() {
		traversePreOrder(root);
		System.out.println("word count: "+count);
	}
	
	private void traversePreOrder(Node root) {
		for(Node node : getChilds(root)) {
			if(root.child.get(node.value).isEndOfWord)
				count ++;
			System.out.println(root.child.get(node.value));
			traversePreOrder(root.child.get(node.value));
		}
	}
	
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	
	private void traversePostOrder(Node root) {
		for(Node node : getChilds(root)) {
			traversePostOrder(root.child.get(node.value));
			System.out.println(root.child.get(node.value));
		}
	}

	public void remove(String str) {
		if(str == null)
			return;
		
		char[] chars= str.toCharArray();
		
		remove(chars, 0, root);
	}
	
	private void remove(char[] chars, int index, Node nodeCurrent) {
		if(index == chars.length) {
			nodeCurrent.isEndOfWord = false;
			return;
		}

		if(nodeCurrent.child.get(chars[index]) == null)
			return;
		
		remove(chars, index + 1, nodeCurrent.child.get(chars[index]));
	
		if(getChilds(nodeCurrent.child.get(chars[index])).length == 0 && nodeCurrent.child.get(chars[index]).isEndOfWord == false)
			nodeCurrent.child.remove(chars[index]);
		
		return;
	}
	
	public void autoCompletion(String str) {
		if(str == null)
			return;
		
		nodeCurrent = findLastNode(str);
		
		if(nodeCurrent == null)
			return;
		
		List<String> words = new ArrayList<String>();
		
		autoCompletion(nodeCurrent, str, words);
		
		System.out.println("list contains: "+words);
	}

	private void autoCompletion(Node nodeCurrent, String str, List<String> words) {
		if(nodeCurrent.isEndOfWord == true)
			words.add(str);
		
		for(Node node : getChilds(nodeCurrent))
			autoCompletion(node, str + node.value, words);
	}
	
	private Node findLastNode(String str) {
		nodeCurrent = root;
		
		for(char ch : str.toCharArray()) {
			if(notDuplicated(ch))
				return null;
			
			forwardToNext(ch);
		}
		
		return nodeCurrent;
	}
	
	public String longestCommonPrefix(String[] words) {
		for(String word : words)
			insert(word);
		
		StringBuilder sb = new StringBuilder();
		
		if(getChilds(root).length > 1)
			return "";
		
		nodeCurrent = root;
		
		while(true) {
			for(Node node : getChilds(nodeCurrent)) {
				if(isEndOfWord())
					break;

				sb.append(node.value);
				nodeCurrent = nodeCurrent.child.get(node.value);
			}
			
			if(getChilds(nodeCurrent).length > 1 || nodeCurrent.isEndOfWord == true)
				break;
		}
		
		return sb.toString();
	}

	private Node[] getChilds(Node root) {
		return root.child.values().toArray(new Node[0]);
	}
	
	private boolean notDuplicated(char ch) {
		return nodeCurrent.child.get(ch) == null;
	}
	
	private void addNode(char ch) {
		nodeCurrent.child.put(ch, new Node(ch));
	}
	
	private void forwardToNext(char ch) {
		nodeCurrent = nodeCurrent.child.get(ch);
	}
	
	private boolean isEndOfWord() {
		return nodeCurrent.isEndOfWord == true;
	}
	
}
