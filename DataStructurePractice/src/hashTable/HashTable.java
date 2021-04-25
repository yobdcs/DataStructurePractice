package hashTable;

public class HashTable {
	
	private class Node {
		Entry value;
		Node next;
		public Node(Entry entry) {
			this.value = entry;
		}
	}
	
	private class Entry {
		int k;
		String v;
		public Entry(int k, String v) {
			this.k = k;
			this.v = v;
		}
	}
	
    private Node[] L;
    private Node first;
    private Node temp;
	private Node temp_back;
	private int array_size = 6;
	
	public HashTable() {
		L = new Node[array_size];
	}

	public void put(int k, String v) {
		if(hashNagtive(k))
			throw new IllegalArgumentException();
		
		Entry entry = new Entry(k, v);
		Node node = new Node(entry);
		
		if(!isEmpty(k))
			chaining(node);
		else
			L[getHash(k)] = node;
	}
	
	public void remove(int k) {
		if(hashNagtive(k) || isEmpty(k))
			throw new IllegalArgumentException();
		
		if(L[getHash(k)].next != null) {
			first = L[getHash(k)];
			temp = temp_back = first;
			temp = temp.next;
			
			if(k == first.value.k) {
				L[getHash(k)] = temp;
				first = null;
				return;
			}
			
			while(!lastOfChain()) {
				if(k == temp.value.k) {
					temp_back.next = temp.next;
					temp = null;
					return;
				}
				temp = temp.next;
				temp_back = temp_back.next;
			}
			throw new IllegalArgumentException();

		} else
			L[getHash(k)] = null;
	}

	public String get(int k) {
		if(hashNagtive(k) || isEmpty(k))
			throw new IllegalArgumentException();

		if(L[getHash(k)].next != null) {
			first = L[getHash(k)];
			temp = first;

			if(k != L[getHash(k)].value.k) {
				while(!lastOfChain()) {
					temp = temp.next;
					if(k == temp.value.k)
						return temp.value.v;
				}
				throw new IllegalArgumentException();
			}
			
		} else {
			if(k != L[getHash(k)].value.k)
				throw new IllegalArgumentException();
		}
		
		return L[getHash(k)].value.v;
	}
	
	private boolean isEmpty(int k) {
		return L[getHash(k)] == null;
	}
	
	private boolean lastOfChain() {
		return temp.next == null;
	}
	
	private boolean hashNagtive(int k) {
		return k < 0;
	}
	
	private int getHash(int k) {
		return k % array_size;
	}
	
	private void chaining(Node node) {
		temp = L[getHash(node.value.k)];
		
		while(!lastOfChain()) {
			if(temp.value.k == node.value.k) {
				temp.value.v = node.value.v;
				return;				
			}
			temp = temp.next;
		}
		temp.next = node;
	}
	
}

