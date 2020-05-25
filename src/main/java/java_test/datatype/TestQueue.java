package java_test.datatype;

import java.util.ArrayList;

public class TestQueue {
	protected Object[] data;
	protected int dataLength = -1;
	protected int point = -1;
	protected int index = -1;
	protected int size;
	
	public TestQueue (int size) {
		this.size = size;
		data = new Object[size];
	}
	
	public void push (Object value) {
		if (fullCheck()) {
			++dataLength;
			data[++index] = value;			
		} else {
			System.out.println("full queue");
		}
	}
	
	public Object peek() {
		--dataLength;
		Object returnData = data[++point];		

		data[point] = null;
		
		if (index == (size - 1)) {
			index = -1;
		}
		
		if (point == (size - 1)) {
			point = -1;
		}
		
		if (nullCheck()) {
			point = -1;
			index = -1;
		}
		
		return returnData;
	}
	
	public boolean fullCheck () {
		return dataLength == size - 1 ? false : true;
	}
	
	public boolean nullCheck () {
		return index == point ? true : false;
	}
	
	public static void main(String[] args) {
		TestQueue tq = new TestQueue(3);
		tq.push(11);
		tq.push(22);
		tq.push(33);
		System.out.println(tq.peek());
		System.out.println(tq.peek());
		tq.push(44);
		System.out.println(tq.peek());
		tq.push(55);
		tq.push(66);
		System.out.println(tq.peek());
		System.out.println(tq.peek());
		tq.push(77);
		tq.push(88);
		tq.push(99);
		tq.push(100);
		System.out.println(tq.peek());
		System.out.println(tq.peek());
		System.out.println(tq.peek());
		System.out.println(tq.peek());
		
		ArrayList<Character> aa = new ArrayList<Character>();
		aa.add('c');
	}

}
