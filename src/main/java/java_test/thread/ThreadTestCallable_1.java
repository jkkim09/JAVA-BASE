package java_test.thread;

import java.util.concurrent.Callable;

public class ThreadTestCallable_1 implements Callable<Integer>{
	private int number = 10000;
	
	public void numberDown() {
		try {
			this.number -= 900;
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Integer call() {
		System.out.println("Callable ----- "+ Thread.currentThread().getName());
		numberDown();
		return number;
	}
}
