package java_test.singletonPattern;

public class TestSingleton {
	public static TestSingleton instance;
	
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
