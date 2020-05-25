package java_test.singletonPattern;

public class SingletonMain {
	public static void main(String[] arg) {
		TestSingleton ts1 = TestSingleton.getInstance();
		TestSingleton ts2 = TestSingleton.getInstance();
		
		// 0 0
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
		
		// 1 1
		ts1.setValue(1);
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
		
		// 2 2
		ts1.setValue(2);
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
		
		System.out.println(ts1.hashCode());
		System.out.println(ts2.hashCode());
		
		Singoleton s1 = Singoleton.instance;
		Singoleton s2 = Singoleton.instance;
		
		System.out.println(s1.getA());
		s1.setA(500);
		System.out.println(s1.getA());
		System.out.println(s2.getA());
	
	}
}
