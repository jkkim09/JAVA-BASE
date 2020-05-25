package java_test.singletonPattern;

public class Singoleton {
	private int a = 100;
	
	static Singoleton instance = new Singoleton();
	
	private Singoleton () {}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Singoleton getInstance () {
		return instance;
	}
}
