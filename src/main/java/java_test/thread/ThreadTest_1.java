package java_test.thread;

public class ThreadTest_1 { 
	public static void main(String[] args) {
		ThreadTestRunable_1 runable = new ThreadTestRunable_1(1000);
		for (int i = 0 ; i<25; i++) {
			Thread t = new Thread(runable, i+"-test-thread" );
			t.start();
		}
	}
}
