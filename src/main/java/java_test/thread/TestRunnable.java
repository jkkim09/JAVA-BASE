package java_test.thread;

public class TestRunnable implements Runnable {
    @Override
	public void run() {
        System.out.println("RUN");
    }

    public static void main(String[] args) {
        TestRunnable ct = new TestRunnable();
        Thread t = new Thread(ct,"1-thread");
        t.start();
    }
}