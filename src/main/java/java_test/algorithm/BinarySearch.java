package java_test.algorithm;

import java.util.Scanner;

public class BinarySearch {
	private static int count = 1;
	
    public static void main(String[] args) {
        int[] dataArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("검색할 데이터를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        int search = Integer.parseInt(scan.next());
        scan.close();
        int result = binarySearch(dataArray, search);
        if (result == -1) {
        	System.out.println("데이터를 찾지 못하였습니다");        
        } else {
        	System.out.println("데이터의 index는 " + result + " 입니다.");        	
        }
        System.out.println("갬색 횟 수 : " + count);
    }

    public static int binarySearch(int[] arr, int search) {
        int low = 0;
        int mid = 0;
        int high = arr.length;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < search) {
                low = mid + 1;
            } else if (arr[mid] > search) {
                high = mid - 1;
            } else {
            	return mid;            	
            }
            ++count;
        }
        return -1;
    }
}