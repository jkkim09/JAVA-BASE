package java_test.thread;

import java.util.concurrent.Callable;

public class ThreadTestCallable_1 implements Callable<Integer>{
	private int number = 10000;
	
	public void numberDown() {
		this.number -= 900;
	}
	
	public Integer call() {
		System.out.println("Callable ----- "+ Thread.currentThread().getName());
		numberDown();
		return number;
	}
}
