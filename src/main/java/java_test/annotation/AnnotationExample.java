package java_test.annotation;

import java.lang.reflect.Method;

@TypeAnnotation
public class AnnotationExample {
	public static void main(String[] args) {
		AnnotationTest ae = new AnnotationTest();
		TypeAnnotation ta = ae.getClass().getAnnotation(TypeAnnotation.class);
		System.out.println(ta.type());
		// Class 의 메소드를 얻어온다
		// return Type은 Method[] 이다
		Method[] methods = AnnotationTest.class.getDeclaredMethods();
		for (Method method : methods) {
			// 각각 method에 MyAnnotation 어노테이션이 있는지 확인한다.
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				// MyAnnotation 객체 를 가져온다
				MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
				// method 이름 
				System.out.println(method.getName() + "=> value : " + myAnnotation.value() + " , number : " + myAnnotation.number());
				// invoke()로 method를 실행 시킨다.
				try {
					// method 를 실행 시키고 값을 넘겨 준다. 
					method.invoke(new AnnotationTest(), myAnnotation.value(), myAnnotation.number());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
