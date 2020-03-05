# Thread

## 1.Thread?
\- 프로세스 내부에서 독립적으로 실행하는 작업<br>
\- JVM에 의해 프로세스가 발생하고 main()문의 실행도 하나의 Thread이다.<br>
\- main() thread 이외에 다른 thread를 만들기위해 Thread 클래스를 상속하거나 Runnable 인터페이스를 구현 하여 Thread를 생성할 수 있다.

````java
// Thread 상속
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
````

TestThread Class 에소 Thread를 상속받아 "run()" 메소드를 제정으 하여 Thread가 동작 시킬 로직을 구현한다 

````java
// Runnable 인터페이스를 구현
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
````

## 2. Multi Thread
\- 복수의 Thread를 사용하여 동시에 여러 작업을 할 수 있는 기능 이다.<br>
\- 자원을 공유할 수 있기 때문에 코드의 동기나 구조를 잘 고려 하지 안으면 난해해지고 서비스 플로우에 오류를 발생 시킬 수 있다.