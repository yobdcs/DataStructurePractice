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
		
	}
	
}
