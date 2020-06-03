package java_test.singletonPattern.test;

public class TestSingleton implements Runnable{
	private volatile static TestSingleton instance;
	
	private int volum = 100;
	
	private TestSingleton () {
	}
	
	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	static TestSingleton getInstance () {
		if (instance == null) {
			instance = new TestSingleton();
		}
		return instance;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getVolum());
	}
}
