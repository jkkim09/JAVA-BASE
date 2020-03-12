package java_test.dataStructure.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] ages) {
		System.out.println("<HashSet>");
		Set<String> hashSet =new HashSet();
		// add()
		System.out.println("----------------------add()--------------------------");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		System.out.println(hashSet.add("G")); 
		System.out.println(hashSet.add("D"));
		System.out.println(hashSet);
		
		// remove()
		System.out.println("-------------------------remove()-----------------------");
		hashSet.remove("B");
		System.out.println(hashSet.remove("C")); 
		System.out.println(hashSet.remove("C"));
		
		// removeAll()
		System.out.println("---------------------removeAll()--------------------------");
		hashSet.removeAll(hashSet);
		System.out.println(hashSet);
		Set<String> remove_target =new HashSet();
		remove_target.add("B");
		remove_target.add("C");
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		System.out.println(hashSet.removeAll(remove_target));
		System.out.println(hashSet);
		
		// removeIf()
		System.out.println("---------------------removeIf()---------------------------");
		hashSet.removeIf(item -> item == "A");
		System.out.println(hashSet);
		
		// clear()
		System.out.println("----------------------clear()--------------------------");
		hashSet.clear();
		System.out.println(hashSet);
		
		// contains()
		System.out.println("------------------------contains()------------------------");
		System.out.println(hashSet.contains("A"));
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		System.out.println(hashSet.contains("A"));
		
		// iterator()
		System.out.println("-----------------------iterator()-------------------------");
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		// isEmpty()
		System.out.println("-----------------------isEmpty()-------------------------");
		System.out.println(hashSet.isEmpty());
		hashSet.clear();
		System.out.println(hashSet.isEmpty());
		
		System.out.println("<LinkedHashSet>");
		Set<String> linke = new LinkedHashSet<String>();
		linke.add("A");
		linke.add("B");
		linke.add("C");
		linke.add("D");
		System.out.println(linke);
		
		System.out.println("<TreeSet>");
		int[] int_list = {80, 95, 50, 35, 45, 65, 10, 100};
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		Set<Integer> st = treeSet;
		for (int n : int_list) {
			treeSet.add(n);
		}
		
		System.out.println("기준값보다 작은값 : " + treeSet.headSet(50));
		System.out.println("기준값보다 큰값: " + treeSet.tailSet(50));
		System.out.println("두사이 값: " + treeSet.subSet(35, 50));
	}
}
