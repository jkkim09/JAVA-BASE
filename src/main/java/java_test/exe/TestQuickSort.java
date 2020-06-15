package java_test.exe;

import java.util.Arrays;

public class TestQuickSort {
	public static void sort(int[] arr, int left, int rigjt) {
		if (left < rigjt) {
			int l, r, mV, h;	
			l = left;
			r = rigjt;
			mV = arr[(l+r)/2];
			while(l<r) {
				while(arr[r] > mV) r--;
				while(arr[l] < mV) l++;
				h = arr[l];
				arr[l] = arr[r];
				arr[r] = h;
			}
			sort(arr, left, l-1);
			sort(arr, l+1, rigjt);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1 ,4, 2, 8, 10, 7, 3, 9, 5, 6};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
