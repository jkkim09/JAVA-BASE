package java_test.dataStructure.collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println("int 1의 index위치 : " + stack.search(1));
		stack.pop();
		System.out.println("int 1의 index위치 : " + stack.search(1));
	}
}
