package arrayList;
public class Array {
	
	int count = 0;
	int[] a;
	
	public Array(int length) {
		a = new int[length];
	}
	
	public void print() {
		for(int j = 0 ; j < count ; j++)
		    System.out.println(a[j]);
	}
	
	public void insert(int item) {
		a[count ++] = item;
		
		if(count == a.length) {
			int[] b = new int[2 * count];
			
			for(int j = 0 ; j < count ; j++)
				b[j] = a[j];
			
			a = b;
		}
	}
	
	public int indexOf(int item) {
		for(int i = 0 ; i < count ; i++) {
			if(a[i] == item)
				return i;
		}
		return -1;
	}
	
	public void removeAt(int index) {
		if(index < 0 || index >= count)
			throw new IllegalArgumentException();

		for(int j = index ; j < count ; j++)
			a[j] = a[j+1];

		count --;
	}

}
