package sortingAlgorithms;

import java.util.LinkedList;
import java.util.List;

public class SortingAlgorithum {
	
//------------------------------------------------------------------------------------
// comparison sorts
	
	public int[] bubbleSort(int[] array) {
		for(int i = 0 ; i < array.length ; i ++) {
			for(int j = 1 ; j < array.length - i; j ++) {	
				if(array[j] < array[j - 1])
					swap(array, j, j - 1);
			}	
		}
		return array;
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
//------------------------------------------------------------------------------------
	public int[] selectionSort(int[] array) {
		for(int i = 0 ; i < array.length ; i ++) {
			int minj = i;
			for(int j = i ; j < array.length - 1 ; j ++) {
				if(array[j + 1] < array[minj])
					minj = j + 1;
			}
			swap(array, i, minj);
		}
		return array;
	}
	
//------------------------------------------------------------------------------------
	public int[] insertionSort(int[] array) {
		for(int i = 1 ; i < array.length ; i ++) {
			int temp = array[i];
			int j = i - 1;
			while(j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j --;
			}
			array[j + 1] = temp;
		}
		return array;
	}

//------------------------------------------------------------------------------------
	public int[] mergeSort(int[] array) {
		if(array == null)
			throw new IllegalStateException();

		return mergeSortR(array);
	}
	
	private int[] mergeSortR(int[] array) {
		if(array.length <= 1)
			return array;
				
		int[] arrL = new int[array.length / 2];
		for(int i = 0 ; i < array.length / 2 ; i ++)
			arrL[i] = array[i];

		int[] arrR = new int[array.length - array.length / 2];
		for(int i = 0 ; i < array.length - array.length / 2 ; i ++)
			arrR[i] = array[i + array.length / 2];
	
		return merge(array, mergeSortR(arrL), mergeSortR(arrR));
	}
	
	private int[] merge(int[] array, int[] arrL, int[] arrR) {
		int l = 0, r = 0;
		for(int i = 0 ; i < array.length ; i ++) {	
			if(l == arrL.length) {
				array[i] = arrR[r ++];
				continue;
			}
		
			if(r == arrR.length) {
				array[i] = arrL[l ++];
				continue;
			}
			
			if(arrL[l] < arrR[r])
				array[i] = arrL[l ++];
			else
				array[i] = arrR[r ++];
		}
		return array;
	}

//------------------------------------------------------------------------------------
	public int[] quickSort(int[] array) {
		if(array == null)
			throw new IllegalStateException();
		
		return quickSort(array, 0, array.length - 1);
	}

	private int[] quickSort(int[] array, int start, int end) {
		if(start >= end)
			return array;
		
		var boundary = partition(array, start, end);
		
		quickSort(array, start, boundary - 1);
		quickSort(array, boundary + 1, end);
		
		return array;
	}

	private int partition(int[] array, int start, int end) {
		var pivit = array[end]; 
		var i = start;
		var boundary = start - 1;
		for(; i <= end ; i ++) {			
			if(array[i] <= pivit)
				swap(array, i, ++ boundary);
		}
		return boundary;
	}

//------------------------------------------------------------------------------------
// non-comparison sorts
	
	public int[] countingSort(int[] array, int max) {
		int[] temp = new int[max + 1];
		for(int item : array)
			temp[item] ++;

		int gap = 0;
		for(int i = 0; i < temp.length ; i ++) {
			if(temp[i] == 0) {
				gap ++;
				continue;
			}
			
			int j = 0;
			for(; j < temp[i] ; j ++)
				array[i + j - gap] = i;

			if(j > 1)
				gap -= j - 1;
		}
		return array;
	}

//------------------------------------------------------------------------------------	
	public int[] bucketSort(int[] array, int numOfbucket) {
		var buckets = createBuckets(array, numOfbucket);
		
		int index = 0;
		for(int i = 0 ; i < numOfbucket ; i ++) {
			if(buckets[i] == null)
				buckets[i] = new LinkedList<Integer>();
			
			if(buckets[i].size() == 1) {
				array[index ++] = buckets[i].get(0);
				continue;
			}

			for(var item : insertionSortI(buckets[i].toArray(new Integer[0])))
				array[index ++] = item;
		}			
		return array;
	}
	
	private List<Integer>[] createBuckets(int[] array, int numOfbucket){
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = new LinkedList[numOfbucket];

		for(int i = 0 ; i < array.length ; i ++) {
			if(buckets[array[i] / numOfbucket] == null)
				buckets[array[i] / numOfbucket] = new LinkedList<Integer>();
			
			buckets[array[i] / numOfbucket].add(array[i]);
		}
		return buckets;
	}
	
	private Integer[] insertionSortI(Integer[] array) {
		for(int i = 1 ; i < array.length ; i ++) {
			int temp = array[i];
			int j = i - 1;
			while(j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j --;
			}
			array[j + 1] = temp;
		}
		return array;
	}

}
