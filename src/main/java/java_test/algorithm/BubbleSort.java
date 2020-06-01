package java_test.algorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] list = {1 , 2, 4, 8, 10, 7, 3, 9, 5, 6};
		int length = list.length;
		
		for (int b=0; b<length; b++) {
			for (int a=b+1; a<length; a++) {
				if(list[b] > list[a]) {
					int befor = list[b];
					list[b] = list[a];
					list[a] = befor;
				}
				System.out.println(Arrays.toString(list));
			}
		}
		
		System.out.println("정렬 : " + Arrays.toString(list));
	}
}
