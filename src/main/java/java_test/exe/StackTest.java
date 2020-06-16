package java_test.exe;

public class StackTest {
	int size;
	Object[] data;
	int top = -1;
	
	public StackTest(int s) {
		data = new Object[s];
		size = s;
	}
	
	public void push(Object d) {
		if (top < size-1) {
			data[++top] = d;
		}
	}
	
	public Object pop() {
		if(top >= 0) {
			return data[top--];
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		StackTest s = new StackTest(3);
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.push(4);
		s.push(5);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		s.push(6);
		s.push(7);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
