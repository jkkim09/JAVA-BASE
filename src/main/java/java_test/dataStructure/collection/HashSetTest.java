package java_test.dataStructure.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] ages) {
		Set<String> hashSet =new HashSet();
		// add()
		System.out.println("----------------------add()--------------------------");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		System.out.println(hashSet.add("G")); // 넣을 값이 set에 없으면TRUE
		System.out.println(hashSet.add("D")); // 이미 저장 되어있으면 FALE 없으면 TRUE
		System.out.println(hashSet);
		
		// remove()
		System.out.println("-------------------------remove()-----------------------");
		hashSet.remove("B");
		System.out.println(hashSet.remove("C")); // 삭제 되었으면 true
		System.out.println(hashSet.remove("C")); // 삭제 할 것이 없다면 false
		
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
	}
}
