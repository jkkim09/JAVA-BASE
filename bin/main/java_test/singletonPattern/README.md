# Singleton 패턴
Class 를 최초 한번만 메모리에 할당되어 사용하는 패턴을 의미한다. 예를 들어 시스텝 볼륨을 높일때 System sy1 = new System(), System sy2 = new System() 두 객체 모두 결국 하나의 System 객체에 접근하여 볼륨을 조절 할 수 있는 기능을 구현 할 수있다

##### 1.1
````java
public class TestSingleton {
	private static TestSingleton instance;
	
	private int value = 0;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private TestSingleton () {
	}
	
	public static TestSingleton getInstance () {
		if (instance == null) {
			instance = new TestSingleton();
		}
		return instance;
	}
	
}
````
##### 1.2
````java
public class SingletonMain {
	public static void main(String[] arg) {
		TestSingleton ts1 = TestSingleton.getInstance();
		TestSingleton ts2 = TestSingleton.getInstance();
	
		// 0 0
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
		
		// 1 1
		ts1.setValue(1);
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
		
		// 2 2
		ts1.setValue(2);
		System.out.println(ts1.getValue());
		System.out.println(ts2.getValue());
	}
}
````

## Info
- volatile : Java 변수를 Main Memory에 저장
- static : static 변수는 오브젝트가 몇 개이건 단 1개만 생성된다.

TestSingleton Class 를 생성자를 prtivate 이 기때문에 다른 Class 에서 new TestSingleton() 생성할 수 었다. 그렇세때문에 static 메소드인 getInstance() 로 TestSingleton 의 instance 값을 가져올 수 있다. 이러한 패턴을 Singleton 이라고하여 ts1, ts2 는 결국 하나의 메모리값을 첨조 하고 있다고 할 수 있다. 그렇게 때문에 ts1, ts2 어디서든 setValue로 값을 변경하면 getValue 에서는 같은 값을 조회한다.