package java_test.singletonPattern;
/**
 * 
 * @author catenoid-dev1
 *
 * https://parkcheolu.tistory.com/15
 * https://blog.naver.com/gngh0101/221073668809
 *
 */
public class MySingleton {
	private volatile static MySingleton instannce;

	private MySingleton() {
		/* Reflection */
		if (instannce != null) throw new InstantiationError("Creating of this object is not allowed.");
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
