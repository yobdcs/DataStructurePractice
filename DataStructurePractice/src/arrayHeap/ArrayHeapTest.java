package arrayHeap;

import java.util.Arrays;

public class ArrayHeapTest {

	public static void main(String[] args) {
		
		int[] values = {15, 10, 15, 8, 12, 9, 4, 1, 24}; 
//		int[] values = {5, 3, 8, 4, 1, 2};
		int[] numbers = {5, 3, 8, 4, 1, 2};
		int[] values2 = new int[values.length];
		ArrayHeap ah = new ArrayHeap(values.length);
		ArrayHeap ah2 = new ArrayHeap(values.length);
		ArrayHeap ah3 = new ArrayHeap(numbers.length);
		
		
		for(int value : values) {
			ah.insert(value);
			ah2.insert(value);
		}
	
		for(int num : numbers)
			ah3.insert(num);
		
		System.out.println(ah3.kThLargestNumber(2));
		
//		descending order
		for(int i = 0 ; i < values.length ; i ++)
			values[i] = ah.remove();
		
		
//		ascending order
//		for(int i = values.length - 1 ; i >= 0 ; i --)
//			values2[i] = ah2.remove();
		
		
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(values2));
		
	}

}
