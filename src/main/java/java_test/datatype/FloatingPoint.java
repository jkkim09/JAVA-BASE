package java_test.datatype;

import java.util.Stack;

public class FloatingPoint {
	public static float a = 6.52f;
	
	public static <E> void main(String[] args) {
		int b = (int) Math.floor(a); // 지수
		float c = a - b; // 가수
		System.out.println("지수 : " + b);
		System.out.println("가수 : " + c);
		
		// 지수 부분
		StringBuilder sb = new StringBuilder();
		while(b != 0) {
			int d = b%2;
			b = b/2;
			sb.append(d);
		}
		
		int count = 0;
		StringBuilder sb2 = new StringBuilder();
		while(c != 0.0) {
			float e = c *2;
			if ((e - 1) == 0.0) {
				break;
			} else {
				sb2.append((int)Math.floor(e));
				c = Float.parseFloat(String.format("%.2f", (e >= 1) ? (e-1) : e));
			}			
			count++;
			if (count == 50) break;  // 지정하지 안으면 무한 루프로 돌 수 있다.
		}
		
		System.out.println("지수 : " + sb.reverse().toString());
		System.out.println("가수 : " + sb2.reverse().toString());
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
	}
}
