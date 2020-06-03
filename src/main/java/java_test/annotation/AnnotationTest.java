package java_test.annotation;

public class AnnotationTest {
	@MyAnnotation
	public void method1 (String test, int test2) {
		System.out.println("test1");
		System.out.println(test);
		System.out.println(test2);
	}
	
	@MyAnnotation("jk2")
	public void method2 (String test, int test2) {
		System.out.println("test2");
		System.out.println(test);
		System.out.println(test2);
	}
	
	@MyAnnotation(value="jk3", number=33)
	public void method3 (String test, int test2) {
		System.out.println("test3");
		System.out.println(test);
		System.out.println(test2);
	}
}
