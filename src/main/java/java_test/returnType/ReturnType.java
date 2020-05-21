package java_test.returnType;

import java.util.ArrayList;
import java.util.HashMap;

public class ReturnType {
	
	public String stringReturn () {
		String st = "string";
		return st;
	}
	
	public char charReturn () {
//		char 는 한문자를 나타내기 때문에  " " 대신 ' ' 을 사용한다
//		char c = "a";
		char d = 'a';
		return d;
	}
	
	
	public int intReturn () {
		int i = 10;
		return i;
	}

	public double doubleReturn () {
		double d = 10.0;
		return d;
	}
	
	public ArrayList<String> arrayReturn () {
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		return al;
	}
	
	public HashMap<String, Integer> mapReturn () {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("key", 100);
		return hm;
	}
	

	public TestGetter getGetter () {
		TestGetter tg = new TestGetter();
		tg.setTestString("testGetter");
		return tg;
	}
	
	public void voidMethod() {
		System.out.println("void 드는 return이 없습니다.");
	}
	
	public static void main(String[] args) {
		ReturnType rt = new ReturnType();
		
		System.out.println(rt.stringReturn());
		System.out.println(rt.charReturn());
		System.out.println(rt.intReturn());
		System.out.println(rt.doubleReturn());
		System.out.println(rt.arrayReturn());
		System.out.println(rt.mapReturn());
		System.out.println(rt.getGetter().getTestString());
		rt.voidMethod();
	}

}
