package java_test.exe;

import java.util.Scanner;

public class BinarySearchTest {
	public static void test () {
		String a = "AbcDeFg";
		char[] b = a.toCharArray();
		int length = b.length;
		StringBuffer sb = new StringBuffer();
		for (int i=length; i>0; i--) {
			sb.append(b[i-1]);
		}
		System.out.println(sb.toString());
	}
	
	public static int binarySearch(int[] arr, int s) {
		int l = 0;
		int m = 0;
		int h = arr.length;
		while(l <= h) {
			m = (l+h) / 2;
			if (m < s) {
				l = m+1;
			} else if (m > s) {
				h = m-1;
			} else {
				return m;
			}
		}	
		return -1;
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,3,5,7,9,10,2,4,8,6};
//		Scanner sc = new Scanner(System.in);
//		int s = Integer.parseInt(sc.next());
//		sc.close();
//		int r = binarySearch(arr, s);
//		System.out.println(r);
		test();
	}
}
