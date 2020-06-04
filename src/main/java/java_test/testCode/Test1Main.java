package java_test.testCode;

import java.lang.reflect.Method;

public class Test1Main {
	public static void main(String[] args) {
		Method[] methods = Test1.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			try {
				method.invoke(new Test1Main());				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
}
