package java_test.exe;

import java.util.Scanner;

public class C {

	public static int add(int n) {
		int sum = 0;
		int s = 1;
		if (n % 2 == 0) {
			sum = (s + n) * (n/2);
		}else {
			sum = (s + (n-1)) * (n/2) + n;
		}
		return sum;
	}
	
	// 소수 찾기
	public static boolean test1() {
		boolean r = true;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();
		for (int i = n-1; i>1; i--) {
			if (n % i == 0) {
				r = false;
			}
		}
		return r;
	}
	
	public static void test2(int n) {
		for (int i=n; i>0; i--) {
			for (int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(add(5));
//		System.out.println(test1());
		test2(4);
	}

}
