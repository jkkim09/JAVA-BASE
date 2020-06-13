package java_test.algorithm;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * 뒤 쪽 부터 시작하여 앞에 값들을 비교한다.
	 * @param arr
	 */
	public static void insertionSort(int[] arr)
	{

	   for(int index = 1 ; index < arr.length ; index++){

	      int temp = arr[index]; // 비교할 key값
	      int aux = index - 1; // 비교될 첫번쨰 index

	      // 비교할 index 가 없을때 까지 && 비교할 key 값이 작을때까지 계속
	      // arr[aux] > temp 부호를 바꾸면 내림차순이 된다.
	      while( (aux >= 0) && ( arr[aux] > temp ) ) {

	         arr[aux+1] = arr[aux];
	         aux--;
	         System.out.println(Arrays.toString(arr));
	      }
	      System.out.println(aux);
	      arr[aux + 1] = temp;
	   }
	   System.out.println("결과 : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1 ,4, 2, 8, 10, 7, 3, 9, 5, 6};
		insertionSort(arr);
	}
}
