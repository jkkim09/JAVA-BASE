package java_test.exe;

import java.util.Arrays;

public class A {
	public A() {
		System.out.println("A  test");
	}
	
	protected void test() {
		System.out.println("test");
	}
	
	public static void sort(int[] arr) {
		for (int a=1; a<arr.length; a++ ) {
			int k = arr[a];
			int index = a-1;
			while(index >= 0 && arr[index] > k) {
				arr[index+1] = arr[index];
				index--;
			}
			arr[index+1] = k;
		}

	}
	
	public static void main(String[] args) {
		int[] aa = {4,1,6,9,7,8,3,5,2};
		sort(aa);
		System.out.println(Arrays.toString(aa));
	}
}
