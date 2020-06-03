package java_test.singletonPattern;

public class MySingleton {
	private volatile static MySingleton instannce;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (instannce == null) { // 1. if
			synchronized (MySingleton.class) {
				if (instannce == null) { // 2. if
					instannce = new MySingleton();
				}
			}
		}
		return instannce;
	}
}
