package java_test.thread;

public class ThreadTestRunable implements Runnable{
	private int downPrice = 1200;
	int price = 10000;

	public synchronized void downPrice(int down) {
		try {
			int get_price = getPrice();
			if (get_price > 0 && get_price - downPrice > 0) {
				price -= down;
				Thread.sleep(1);			
			}else {
				return;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "----start");
			downPrice(downPrice);
			System.out.println(Thread.currentThread().getName() + "----down price : "+ getPrice());				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
