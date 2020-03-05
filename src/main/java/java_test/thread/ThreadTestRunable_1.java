package java_test.thread;

public class ThreadTestRunable_1 implements Runnable{
	private int set_down_price = 1020;
	int price = 20000;

	public ThreadTestRunable_1(int set_down_price) {
		this.set_down_price = set_down_price;
	}
	
	public synchronized void downPrice() {
		try {
			int get_price = getPrice();
			if (get_price >= 0 && get_price - set_down_price >= 0) {
				this.price -= set_down_price;
				Thread.sleep(200);			
			}else {
				return;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "----start");
			downPrice();
			System.out.println(Thread.currentThread().getName() + "----down price : "+ getPrice());				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
