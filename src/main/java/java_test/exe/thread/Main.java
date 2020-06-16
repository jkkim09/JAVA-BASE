package java_test.exe.thread;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		String aa = "The Curious Case of Benjamin Button";
		String[] bb = aa.split(" ");
		
		System.out.println(Arrays.toString(bb));
		System.out.println(aa.toCharArray());
		
		TestRunable tr = new TestRunable(1000);
		ExecutorService es = Executors.newFixedThreadPool(10);
		for (int i=0; i<5; i++) {
			es.execute(tr);			
		}
	}
}
