package java_test.exe;

import java.util.Arrays;

public class TestInsertSort {
	public static void sort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			int v = arr[i];
			int index = i-1;
			while((index >= 0) && (arr[index] > v)) {
				arr[index+1] = arr[index];
				index--;
			}
			arr[index+1] = v;
		}
	}
	
	public static void main(String[] args) {
		int[] l = {5,2,1,3,4};
		sort(l);
		System.out.println(Arrays.toString(l));
	}
}
