package java_test.singletonPattern.test;

public class TestMain {
	public static void main(String[] args) {
		TestSingleton ts = TestSingleton.getInstance();
		Thread th = new Thread(ts);
		th.start();
	}
}
