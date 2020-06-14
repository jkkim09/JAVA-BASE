package java_test.exe;

public class TestStack implements InterStack {
	int top = -1;
	int max;
	Object[] elements;
	
	public TestStack(int n) {
		max = n;
		elements = new Object[n];
	}
	
	@Override
	public void push(Object data) {
		if (max - 1 > top) {
			elements[++top] = data;			
		}
	}
	
	@Override
	public Object pop() {
		if (top == -1) {
			return null;
		}else {
			return elements[top--];
		}
	}
	
	public static void main(String[] args) {
		TestStack ts = new TestStack(3);
		ts.push(1);
		ts.push(2);
		ts.push(3);
		ts.push(4);
		ts.push(5);
		System.out.println(ts.pop());
	}
}
