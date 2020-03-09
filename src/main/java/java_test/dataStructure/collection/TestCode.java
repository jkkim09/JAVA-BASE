package java_test.dataStructure.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestCode {
	static Integer[] testArray = new Integer[5000000];
	Integer[] values = new Integer[4990];

	public void hashMapTest() {
		long start = System.nanoTime();

		HashMap hashmap = new HashMap();
		for(Integer integer : testArray){
			hashmap.put(integer, integer);
		}
		
		long end = System.nanoTime();
		
		System.out.println("\nHashMap Test");
		System.out.println("\t입력 소요 시간  " + second(start, end) + "초");
		
		start = System.nanoTime();
		for(Integer value : values){
			hashmap.get(value);
		}		
		end = System.nanoTime();
		System.out.println("\t탐색 소요 시간 " + second(start, end) + "초");
		
		start = System.nanoTime();
		for(Integer value : values){
			hashmap.remove(value);
		}
		end = System.nanoTime();
		System.out.println("\t삭제 소요 시간 " + second(start, end) + "초");
	}
	
	public void arrayListTest(){
		long start = System.nanoTime();
		
		ArrayList arrayList = new ArrayList();
		for(Integer integer : testArray){
			arrayList.add(integer);
		}
		
		long end = System.nanoTime();
		
		System.out.println("\nArrayList");
		System.out.println("\t입력 소요 시간  " + second(start, end) + "초");
		
		start = System.nanoTime();
		for(Integer value : values){
			arrayList.get(value);
		}		
		end = System.nanoTime();
		System.out.println("\t탐색 소요 시간 " + second(start, end) + "초");
		
		start = System.nanoTime();
		for(Integer value : values){
			arrayList.remove(value);
		}
		end = System.nanoTime();
		System.out.println("\t삭제 소요 시간 " + second(start, end) + "초");
	}
	
	public void linkedListTest(){
		long start = System.nanoTime();
		
		List linkedList = new LinkedList();
		for(Integer integer : testArray){
			linkedList.add(integer);
		}
		
		long end = System.nanoTime();
		
		System.out.println("\nLinkedList");
		System.out.println("\t입력 소요 시간  " + second(start, end) + "초");
		start = System.nanoTime();
		for(int value : values){
			linkedList.get(value);
		}		
		end = System.nanoTime();
		System.out.println("\t탐색 소요 시간 " + second(start, end) + "초");
		
		start = System.nanoTime();
		for(int value : values){
			linkedList.remove(value);
		}
		end = System.nanoTime();
		System.out.println("\t삭제 소요 시간 " + second(start, end) + "초");
	}


	private void prepare() {
		long start = System.nanoTime();
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}
		long end = System.nanoTime();
		
		ArrayList temp = new ArrayList(1000);
		for(int i = 0 ; i < 4990 ; i++){
			temp.add(i * 1000);
		}
		temp.toArray(values);
		
		
		System.out.println(testArray.length + "개의 인스턴스 생성 시간 " +
				second(start, end) + "초");
		
	}
	
	private double second(long start, long end){
		return (end - start) / Math.pow(10, 9);
	}

	public void start() {
		prepare();
		hashMapTest();
		arrayListTest();
		linkedListTest();
	}

	public static void main(String[] args) {
		TestCode test = new TestCode();
		test.start();
	}
}