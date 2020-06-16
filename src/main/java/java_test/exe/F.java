package java_test.exe;

public class F extends Thread{
	
	@Override
	public void run() {
		System.out.println(currentThread().getName());
	}
	
	public static void main(String[] args) {
		F f = new F();
		f.start();
	}
}
