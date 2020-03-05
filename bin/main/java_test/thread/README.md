# Thread

## 1.Thread?
\- 프로세스 내부에서 독립적으로 실행하는 작업<br>
\- JVM에 의해 프로세스가 발생하고 main()문의 실행도 하나의 Thread이다.<br>
\- main() thread 이외에 다른 thread를 만들기위해 Thread 클래스를 상속하거나 Runnable 인터페이스를 구현 하여 Thread를 생성할 수 있다.

#### 1.1표
|         Thread 생성자         |               설명           |
|-------------------------------|-----------------------------|
|  Thread()                     |                             |
|  Thread(String s)             | 스레드 이름                  |
|  Thread(Runnable r)           | 인터페이스 객체              |
|  Thread(Runnable r, String s) | 인터페이스 객체,  스레드 이름 |


#### 1.2표
|                        Thread 메소드                        |                               설명                               |
|------------------------------------------------------------|------------------------------------------------------------------|
|                       String getName()                     |                       스레드의 이름을 s로 설정                     |
|  void setName(String s)                                    |  스레드의 이름을 s로 설정                                          |
|  void start()                                              |  스레드를 시작 run() 메소드 호출                                   |
|  int getPriority()                                         |  스레드의 우선 순위를 반환                                         |
|  void setpriority(int p)                                   |  스레드의 우선순위를 p값으로                                       |
|  boolean isAlive()                                         |  스레드가 시작되었고 아직 끝나지 않았으면 true 끝났으면 false 반환   |
|  void join() throws InterruptedException                   |  스레드가 끝날 때 까지 대기                                        |
|  void run()                                                |  스레드가 실행할 부분 기술 (오버라이딩 사용)                        |
|  void suspend()                                            |  스레드가 일시정지 resume()에 의해 다시시작 할 수 있다.             |
|  void resume()                                             |  일시 정지된 스레드를 다시 시작.                                   |
|  void yield()                                              |  다른 스레드에게 실행 상태를 양보하고 자신은 준비 상태로             |

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

각각의 스레드는 개별 실행하는 프로그램이지만, 각각의 스레드는 서로 생성한 클래스(인스턴스)를 공유해서 사용할 수 있다는 점이 별도의 프로그램을 돌리는 것과는 차이가 있다.

`````java
// ThreadTest_1 Class
public class ThreadTest_1 {
	public static void main(String[] args) {
		ThreadTestRunable_1 runable = new ThreadTestRunable_1(1000);
		for (int i = 0 ; i<25; i++) {
            // 1.1 표 참조
			Thread t = new Thread(runable, i+"-test-thread" );
            // 1.2 표 참조
			t.start();
		}
	}
}

// ThreadTestRunable_1 Class
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
				Thread.sleep(1);			
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
`````

위 코드는 Runnable 인커페이스의 run() 메소드를 구현한 class 를 Multi Thread를 이용하여 price 값을 Down 시키는 작업을 구현 하였다. 다수의 Thread가 "동일한 자원(int price)"를 Down 시킨다.<br><br>
위에서 봐야할 내용중 downPrice() 메소드의 "synchronized" 가 있을 떄와 없을 떄를 비교하여 Test 해야한다. "synchronized"가 없을 때 다수의 Thread가 동일한 자원을 놓고 비동기로 경쟁하여 처리하기 때문에 if (get_price >= 0 && get_price - set_down_price >= 0) 조건문이 0 이하 일때는 동작하지 안아야할 때 비동기 이기때문에 특정 시점에 이미 0 보다 작언 값을 가져도 price 값을 down 시키는 현상이 발생 할 수 있다. 이러한 문제를 해결하기 위해 "synchronized"를 추가 하여 Thread를 동기화 해야한다.