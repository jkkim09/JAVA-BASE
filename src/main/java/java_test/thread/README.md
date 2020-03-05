# Thread

## 1.Thread?
\- 프로세스 내부에서 독립적으로 실행하는 작업<br>
\- JVM에 의해 프로세스가 발생하고 main()문의 실행도 하나의 Thread이다.<br>
\- main() thread 이외에 다른 thread를 만들기위해 Thread 클래스를 상속하거나 Runnable 인터페이스를 구현 하여 Thread를 생성할 수 있다.


|               Thread 생성자          |               설명           |
|-------------------------------|-----------------------------|
|  Thread()                     |                             |
|  Thread(String s)             | 스레드 이름                  |
|  Thread(Runnable r)           | 인터페이스 객체              |
|  Thread(Runnable r, String s) | 인터페이스 객체와 스레드 이름 |


|  Thread 메소드                                                     |                                   설명                            |
|:----------------------------------------------------------:|:------------------------------------------------------------------:|
|                       String getName()                     |                       스레드의 이름을 s로 설정                      |
|  void setName(String s)                                    |  스레드의 이름을 s로 설정                                           |
|  void start()                                              |  스레드를 시작 run() 메소드 호출                                    |
|  int getPriority()                                         |  스레드의 우선 순위를 반환                                          |
|  void setpriority(int p)                                   |  스레드의 우선순위를 p값으로                                        |
|  boolean isAlive()                                         |  스레드가 시작되었고 아직 끝나지 않았으면 true 끝났으면 false 반환  |
|  void join() throws InterruptedException                   |  스레드가 끝날 때 까지 대기                                         |
|  void run()                                                |  스레드가 실행할 부분 기술 (오버라이딩 사용)                        |
|  void suspend()                                            |  스레드가 일시정지 resume()에 의해 다시시작 할 수 있다.             |
|  void resume()                                             |  일시 정지된 스레드를 다시 시작.                                    |
|  void yield()                                              |  다른 스레드에게 실행 상태를 양보하고 자신은 준비 상태로            |

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

Runnable Interface의 run() 메소드를 구현하여 Thread의 start할 수 있는 로직을 구현한다. TestRunnable ct = new TestRunnable() 로 run() 메소드를 구현된 Class 를 생성하여 Thread로 동작하게 한다.


## 2. Multi Thread
\- 복수의 Thread를 사용하여 동시에 여러 작업을 할 수 있는 기능 이다.<br>
\- 자원을 공유할 수 있기 때문에 코드의 동기나 구조를 잘 고려 하지 안으면 난해해지고 서비스 플로우에 오류를 발생 시킬 수 있다.