package java_test.singletonPattern;
/**
 * 
 * @author catenoid-dev1
 *
 * 참고, 출처 자료 
 * https://parkcheolu.tistory.com/15
 * https://blog.naver.com/gngh0101/221073668809
 *
 */
public class MySingleton {
	/* volatile 필수 */
	private volatile static MySingleton instannce;

	/* 생성자 방지 */
	private MySingleton() {
		/* Reflection 방어 */
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
