package sortingAlgorithms;

public class SortingAlgorithum {
	
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
	public long[] quickSort(int[] a1) {
		
		
		return null;
	}
	
}
