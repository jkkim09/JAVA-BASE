package java_test.datatype;

public class TestQueue2 {
	private Object[] queue;
	private int size = 0;
	private int rear = -1;
	private int front = -1;
	
	TestQueue2(int size) {
		this.size = size;
		this.queue = new Object[size];	// 사이즈 만큼 큐 생성
	}
	
	public void enQueue(Object data) {
		// 먼저 큐가 꽉 차있는지를 검사
		if(isFull()) {
			return;
		}
		queue[++rear] = data;
	}
	
	public Object deQueue() {
		// 먼저 큐가 비어있는지를 검사
		if(isEmpty()) {
			return null;
		}
		
		++front;
		Object temp = queue[front];
		
		queue[front] = null;
		
		// 비어있다면 다시 원점으로 초기화
		if(isEmpty()) {
			rear = -1;
			front = -1;
		}
		
		return temp;
	}
	
	public boolean isFull() {
		return rear == size - 1 ? true : false;
	}
	
	public boolean isEmpty() {
		return front == rear ? true : false;
	}
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		TestQueue2 tq2 = new TestQueue2(3);
		tq2.enQueue(11);
		tq2.enQueue(22);
		tq2.enQueue(33);
		System.out.println(tq2.deQueue());
		tq2.enQueue(44);
		System.out.println(tq2.deQueue());
		System.out.println(tq2.deQueue());
		System.out.println(tq2.deQueue());
	}
}
