package java_test.algorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
	    int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j= 1 ; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("결과 : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] list = {1 , 2, 4, 8, 10, 7, 3, 9, 5, 6};
		bubbleSort(list);
	}
}
