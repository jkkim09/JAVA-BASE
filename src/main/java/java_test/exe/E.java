package java_test.exe;

import java.util.Arrays;

public class E {
	public void sort(int[] arr, int left, int right) {
		if (left < right) {
			int l = left;
			int r = right;
			int mV = arr[(l+r)/2];
			int h;
			while(l<r) {
				while(mV > arr[l]) l++;
				while(mV < arr[r]) r--;
				h = arr[l];
				arr[l] = arr[r];
				arr[r] = h;
			}
			sort(arr, left, l-1);
			sort(arr, l+1, right);
		}
	}
	
	public int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return factorial(n-1) * n;
	}
	
	public void test2 () {
		for (int i=9; i>0; i--) {
			if (i != 3) {
				for (int j=1; j<10; j++) {
					System.out.print(i + " x " + j + " = " + i*j+ "  ");
				}
				System.out.println();				
			}
		}
	}
	
	public static void main(String[] args) {
		E e = new E();
		int[] aa = {4,7,9,1,3,2,8,5,6};
		e.sort(aa, 0, aa.length-1);
		System.out.println(Arrays.toString(aa));
		System.out.println(e.factorial(5));
		e.test2();
	}
}
