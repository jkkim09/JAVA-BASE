package java_test.exe.thread;

public class TestRunable implements Runnable {
	private int num;
	int r = 100;
	
	public int getNum() {
		return num;
	}
	
	public TestRunable(int d) {
		num = d;
	}
	
	@Override
	public void run() {
		re();
	}
	
	public synchronized void re() {
		num -= r;
		System.out.println(num);
		System.out.println(Thread.currentThread().getName());
	}
}
