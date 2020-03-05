package java_test.thread;

public class ThreadTest_1 {
	public static void main(String[] args) {
		ThreadTestRunable runable = new ThreadTestRunable();
		for (int i = 0 ; i<10; i++) {
			Thread t = new Thread(runable, i+"-test-thread" );
			t.start();
		}
	}
}
