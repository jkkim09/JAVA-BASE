package java_test.exe;

import java.util.HashSet;

public class RandomCheck {
	HashSet<Integer> hs = new HashSet<Integer>();
	public boolean randomAdd() {
		int r= (int)(Math.random() * 10) + 1;
		System.out.print(r + " : ");
		return hs.add(r);
	}
	
	public static void main(String[] args) {
		RandomCheck rc = new RandomCheck();
		for (int a=0; a<10; a++) {
			System.out.println(rc.randomAdd());
		}
	}
}
