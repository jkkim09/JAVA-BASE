package java_test.algorithm;

import java.util.Scanner;

public class SequentialSearch {
	/**
	 * 순차 탐색
	 * 
	 * O(n) 의 시간 복잡도를 가진다.
	 * 
	 * for 문은 O(n) 의 시간 복잡도를 가진다.
	 * 
	 * @param intList 	검색 대상
	 * @param target	검색할 값
	 * @return			검색된 값 index
	 */
	static int searchIndex (int[] intList, int target) {
		int check = -1;
		for (int i=0; i<intList.length; i++) {
			if (intList[i] == target) {
				check = i;
			}
		}
		return check;
	}
	
	
	public static void main(String[] args) {
		int[] intList = {11, 22, 33, 44, 55, 66, 77, 88};
		
		Scanner sc = new Scanner(System.in);
		int a =  Integer.parseInt(sc.next());
		sc.close();
		int returnValue = searchIndex(intList, a);
		
		if (returnValue == -1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println("찾는 값은 배열의 " + returnValue + "번째 index에 있습니다.");
		}
	}
}
