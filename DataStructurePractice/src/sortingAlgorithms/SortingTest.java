package sortingAlgorithms;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		SortingAlgorithum sa = new SortingAlgorithum();

//		int[] a1 = {3, 2, 7, 1, 11, 8, 7, 2};
//		int[] a1 = {2, 4, 1, 5, 3};
		int[] a1 = {15, 6, 3, 1, 22, 10, 13};
//		System.out.println("bubble sort: "+ Arrays.toString(sa.bubbleSort(a1)));
//		System.out.println("selection sort: "+ Arrays.toString(sa.selectionSort(a1)));
//		System.out.println("insertion sort: "+ Arrays.toString(sa.insertionSort(a1)));
//		System.out.println("merge sort: "+ Arrays.toString(sa.mergeSort(a1)));
		System.out.println("quick sort: "+ Arrays.toString(sa.quickSort(a1)));
	}

}
