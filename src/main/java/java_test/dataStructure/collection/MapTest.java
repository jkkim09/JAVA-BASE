package java_test.dataStructure.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("--------------put()-----------------");
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);
		System.out.println(map.get("c"));
		System.out.println("--------------containsKey()--------------");
		System.out.println(map.containsKey("c"));
		System.out.println("--------------entrySet()-----------------");
		Set set =  map.entrySet();
		System.out.println(set);
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------keySet()-------------------");
		Set<String> ketSet = map.keySet();
		System.out.println(ketSet);
		System.out.println("--------------values()-------------------");
		Collection<Integer> values = map.values();
		System.out.println(values);
		System.out.println("--------------remove({key}---------------");
		System.out.println(map.remove("b"));
		System.out.println(map.get("b"));
		System.out.println("--------------clear()--------------------");
		map.clear();
		System.out.println(map);
	}
}
