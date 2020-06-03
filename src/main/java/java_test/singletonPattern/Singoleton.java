package java_test.singletonPattern;

public class Singoleton {
	private int a = 100;
	
	static Singoleton instance;
	
	private Singoleton () {}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Singoleton getInstance () {
		if (instance == null) {
			instance = new Singoleton();
		}
		return instance;
	}
}
