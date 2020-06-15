package java_test.exe;

public class B extends A implements InterStack, D {
	public B() {
		super();
		this.test();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}

	@Override
	public void push(Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}
}
