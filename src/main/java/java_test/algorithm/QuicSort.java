package java_test.algorithm;

import java.util.Arrays;

public class QuicSort {
	public static void quickSort(int[] arr, int left, int right) {
	    int i, j, pivot, tmp;
	    if (left < right) {
	        i = left;   j = right;
	        pivot = arr[(left+right)/2]; // arr에 중간 index 값을 찾는다.
	        System.out.println("기준 값 : "+ pivot);
	        //분할 과정
	        while (i < j) {
	        	// i : pivot 보다 큰 값의 index
	        	// j : pivot 보다 작은 값의 index
	            while (arr[j] > pivot) j--; // pivot 보다 작은값의 index을 찾는다.
	            // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
	            while (i < j && arr[i] < pivot) i++; // pivot 보다 큰값의 index을 찾는다.
	            System.out.print(i + "index : " + arr[i] + " , ");
	            System.out.println(j + " : " + arr[j]);
	            tmp = arr[i]; // pivot 보다 큰값
	            arr[i] = arr[j]; // pivot 보다 큰 값과 작은 값의 위치를 바꾼다. 왼쪽 오른쪽 정렬
	            arr[j] = tmp; // 
	        }
	        System.out.println();
	        //정렬 과정
	        System.out.println("작은값들 검색 범위 : "+ left + "~" + (i - 1));
	        System.out.println("큰값들 검색 범위 : "+ (i + 1) + "~" + right);
	        quickSort(arr, left, i - 1);
	        quickSort(arr, i + 1, right);
	    }
	}
	
	public static void main(String[] args) {
		int[] arr = {1 ,4, 2, 8, 10, 7, 3, 9, 5, 6};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
