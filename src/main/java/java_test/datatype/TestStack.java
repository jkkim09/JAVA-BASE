package java_test.datatype;

public class TestStack implements InterStack{
	int top = -1; // 스택 포인터
	private Object[] elementData;
	
	public TestStack (int size) {
		elementData = new Object[size];
	}
	
	@Override
	public Object pop() {
		if (top == -1) {
			return null;
		} else {
			return elementData[top--];			
		}
	}
	
	@Override
	public void push(Object data) {
		elementData[++top] = data;
		
	}
	
	public static void main(String[] args) {
		TestStack ts = new TestStack(5);
		ts.push(11);
		ts.push(22);
		ts.push(33);
		ts.push(44);
		System.out.println("test : " + ts.pop());
		System.out.println("test2 : " + ts.pop());
	}

}
