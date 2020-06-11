package java_test.exe;

public class B extends A{
	public B() {
		super();
		this.test();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
