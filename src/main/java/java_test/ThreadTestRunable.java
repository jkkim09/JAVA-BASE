package java_test;

public class ThreadTestRunable implements Runnable{
	int price = 10000;

	public synchronized void downPrice(int down) {
		price -= down;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "----");
			downPrice(1000);
			System.out.println("down price : "+ getPrice());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
