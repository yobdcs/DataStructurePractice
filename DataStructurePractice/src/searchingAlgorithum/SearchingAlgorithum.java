package searchingAlgorithum;

public class SearchingAlgorithum {
	
	public int linearSearch(int[] array, int target) {
		for(int num : array) {			
			if(num == target)
				return num;
		}
		return -1;
	}

//------------------------------------------------------------------------------------
	public int binarySearchR(int[] array, int target) {
		return binarySearchRR(0, array.length - 1, array, target);
	}
	
	private int binarySearchRR(int left, int right, int[] array, int target) {
		if(left > right)
			return -1;
		
		int middle = (left + right) / 2;
		
		if(target == array[middle])
			return middle;
		
		if(target < array[middle])
			right = middle - 1;
		
		if(target > array[middle])
			left = middle + 1;
		
		return binarySearchRR(left, right, array, target);
	}
	
//------------------------------------------------------------------------------------
	public int binarySearchI(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		
		while(left <= right) {
			int middle = (left + right) / 2;
			
			if(target == array[middle])
				return middle;
			
			if(target < array[middle])
				right = middle - 1;
			
			if(target > array[middle])
				left = middle + 1;
		}
		return -1;
	}

//------------------------------------------------------------------------------------
	public int ternarySearchR(int[] array, int target) {
		return ternarySearchRR(0, array.length - 1, array, target);
	}
	
	private int ternarySearchRR(int left, int right, int[] array, int target) {
		if(left > right)
			return -1;
		
		int partition = (right - left) / 3;
		int mid1 = left + partition;
		int mid2 = right - partition;
		
		if(target == array[mid2])
			return mid2;
		
		if(target == array[mid1])
			return mid1;
		
		if(target > array[mid2])
			left = mid2 + 1;
		
		if(target < array[mid1])
			right = mid1 - 1;
		
		if(target > array[mid1] && target < array[mid2]) {
			left = mid1 + 1;
			right = mid2 - 1;
		}	
		return ternarySearchRR(left, right, array, target);
	}

//------------------------------------------------------------------------------------
	public int jumpSearchI(int[] array, int target) {
		int block = (int) Math.sqrt(array.length);
		int start = 0;
		int next = start + block;
		
		while(start < array.length && target > array[next - 1]) {
			if(target == array[next - 1])
				return next - 1;
			
			start = next;
			next += block;
			
			if(next > array.length - 1)
				next = array.length;
		}

		while(start < next) {
			if(target == array[start])
				return start;
					
			start ++;
		}
		return -1;
	}
	
//------------------------------------------------------------------------------------
	public int exponentialSearch(int[] array, int target) {
		int e = 2;
		while(e < array.length && target > array[e - 1])
			e *= 2;
		
		int right = Math.min(e, array.length - 1);
		
		return binarySearchRR(0, right, array, target);
	}
}
