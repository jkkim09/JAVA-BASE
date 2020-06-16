package java_test.exe;

public class QueueTest {
	Object[] data;
	int dataLength = -1;
	int index = -1;
	int point = -1;
	int size;

	public QueueTest(int s) {
		size = s;
		data = new Object[s];
	}
	
	public void push(Object d) {
		if (fullCheck()) {
			++dataLength;
			data[++index] = d;
		}
	}
	
	public Object peek() {
		--dataLength;
		Object returnData = data[++point];
		data[point] = null;
		if (point == size-1) {
			point = -1;
		}
		
		if (index == size-1) {
			index = -1;
		}
		
		if (point == index) {
			point = -1;
			index = -1;
		}
		return returnData;
	}
	
	public boolean fullCheck() {
		return dataLength == (size-1) ? false:true;
	}
	
	public static void main(String[] args) {
		QueueTest q = new QueueTest(3);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());

		q.push(6);
		q.push(7);
		System.out.println(q.peek());
		System.out.println(q.peek());
	}
}
