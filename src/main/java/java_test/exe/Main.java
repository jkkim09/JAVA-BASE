package java_test.exe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Float> s1 = new LinkedHashSet<Float>();
		s1.add(1.0f);
		s1.add(2.0f);
		s1.add(3.0f);
		s1.add(3.0f);
		s1.add(5.0f);
		
		for (float f : s1) {
			System.out.println(f);
		}
		
		List<Double> l = new ArrayList<Double>();
		l.add(1.0);
		l.add(2.0);
		l.add(3.0);
		l.add(4.0);
		l.add(5.0);
		
		l.add(2, 7.0);
		
		List<Double> l2 = new ArrayList<Double>();
		l2.add(6.0);
		l2.add(7.0);
		l2.add(9.0);
		
		l.remove(3.0);
		
		l.addAll(l2);
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String s = "abc";
		s.toCharArray();
		

	}
}
