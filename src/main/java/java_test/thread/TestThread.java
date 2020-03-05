package java_test.thread;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUN");
    }

    public static void main(String[] args){
        TestThread st = new TestThread();
        st.start();
    }
}
