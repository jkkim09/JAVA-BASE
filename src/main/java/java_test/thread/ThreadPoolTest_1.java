package java_test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest_1 {
	public static void main(String[] args) {
		// Thread�� ���Ѿ��� ����, �����ϴ� ������ Ǯ�� �����Ѵ�.
		ExecutorService service = Executors.newCachedThreadPool();
		ThreadTestRunable_1 runable = new ThreadTestRunable_1(1000);
		for (int i = 0 ; i<25; i++) {
			service.execute(runable);
		}
		System.out.println(">>>>>>>>>>>END");
	}
}
