package java_test;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("test");
		ThreadTestRunable runable = new ThreadTestRunable();
		for (int i = 0 ; i<10; i++) {
			Thread t = new Thread(runable, i+"-test-thread" );
			t.start();
		}
	}
}
