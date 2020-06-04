package java_test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest_2 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		ThreadTestCallable_1 callable = new ThreadTestCallable_1();
		for (int i=1; i<10; i++) {
			Future<Integer> return_value = service.submit(callable);
			try {
				int get_number =  return_value.get();
				
				System.out.println("Callable Return Value : "+ get_number);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		System.out.println(">>>>>>>>>>>>>>END");
	}
}
