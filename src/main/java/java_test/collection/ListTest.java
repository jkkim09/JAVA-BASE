package java_test.collection;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
//		boolean add(E e)
		ArrayList<String> list_1 = new ArrayList<String>();
		list_1.add("T");
		list_1.add("E");
		list_1.add("S");
		list_1.add("T");
		System.out.println("list_1 : " + list_1);
		
//		void add(int index, E element)
		ArrayList<String> list_2 = new ArrayList<String>();
//		list_2.add(0, "T");
//		list_2.add(3, "T");
//		list_2.add(2, "S");
//		list_2.add(1, "E");
		list_2.add("T");
		list_2.add("T");
		list_2.add("T");
		list_2.add("T");
		list_2.add(1, "E");
		list_2.add(2, "S");
		list_2.add(3, "T");
		System.out.println("list_2 : " + list_2);
		
//		addAll
		list_1.addAll(list_2);
		System.out.println("addAll : ");
		for (int i=0; i<list_1.size(); i++) {
			System.out.print(list_1.subList(i, i+1));
		}
		System.out.println();
//		remove
//		list_1.remove(7);
//		list_1.remove(8);
//		list_1.remove(9);
		list_1.remove(7);
		list_1.remove(7);
		list_1.remove(7);
		System.out.println("remove : " + list_1);
	}
}
