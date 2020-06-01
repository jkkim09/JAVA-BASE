package java_test.algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] list) {
	    int indexMin, temp;

	    for (int i = 0; i < list.length - 1; i++) {
	        indexMin = i;	// 범위중 가장 작은값 index
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[j] < list[indexMin]) { // 부호를 바꾸면 내림 차순이 된다.
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];	 	// 가장 작은값을 기억한다.
	        list[indexMin] = list[i]; // 자장 작은 값과 왼쪽 시작 index 와 swap 한다.
	        list[i] = temp; 	// 왼 쪽부터 가장 작은 값을 배치한다.
	        System.out.println(Arrays.toString(list));
	    }
	    
	    System.out.println("결과 : " + Arrays.toString(list));
	}
    
    
	public static void main(String[] args) {
		int[] arr = {1 ,4, 2, 8, 10, 7, 3, 9, 5, 6};
		selectionSort(arr);
	}
}