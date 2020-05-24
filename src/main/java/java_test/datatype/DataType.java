package java_test.datatype;

public class DataType {
	public static void main(String[] args) {
		int a = 10;
		double b = 15.2;
		
		int c = (int) b; // (int) : Casting 연산자 // 15 손실 발생
		
		double d = a;	// 범위가 double 이 int보다 크므로 Casting 연산자를 생략가능하다.
		double e = (int) a;
		
		int i = 0;
		for (; i <= 2100000000; i++) {
			i++;
		}
		System.out.println(i);
		System.out.println(i + 10000000); // 더이상 증가하지 안는다.
	}
}
