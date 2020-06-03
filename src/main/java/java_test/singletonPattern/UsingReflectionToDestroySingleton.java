package java_test.singletonPattern;

import java.lang.reflect.Constructor;

public class UsingReflectionToDestroySingleton {
	public static void main(String[] args) {
		MySingleton instance = MySingleton.getInstance();
		MySingleton instance2 = null;
		try {
			Constructor[] constructors = MySingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (MySingleton) constructor.newInstance();
			}
		} catch (Exception e) {
		}
		System.out.println(instance.hashCode());
//		System.out.println(instance2.hashCode());
	}
}
