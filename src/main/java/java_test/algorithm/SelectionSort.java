package java_test.algorithm;

import java.util.Arrays;

public class SelectionSort {

    private int[] selectionSort(int[] arr){
        int index;
        for(int i = 0; i < arr.length - 1; i++){
            index = i;
            for(int j = i+1; j < arr.length; j++){
            	// i +1 index 위치부터 끝가지 탐색하여 min 값의 index를 찾는다.
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            
            // min 값의 index와 비교 
            swapElements(i, index, arr);
        }
        return arr;
    }
    
    private void swapElements(int index, int lowest, int[] arr){
        int temp = arr[index];
        arr[index] = arr[lowest];
        arr[lowest] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
    
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = {1 ,4, 2, 8, 10, 7, 3, 9, 5, 6};
		System.out.println("Original array- " + Arrays.toString(arr));
	    int[] sortedArray = ss.selectionSort(arr);
	    System.out.println("Sorted array- " + Arrays.toString(sortedArray));
	}
}
