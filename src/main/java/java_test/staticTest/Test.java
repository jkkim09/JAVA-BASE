package java_test.staticTest;

public class Test {

	public static void main(String[] args) {
		// 인스턴스 화 없이 변수 메소드 접근 
		System.out.println("1 : " + StaticClass.testInt);
		System.out.println("2 : " + StaticClass.getTestInt());
		
		// 인스턴스 의 메소드 접근
		StaticClass sc1 = new StaticClass();
		StaticClass sc2 = new StaticClass();
		StaticClass sc3 = new StaticClass();
		StaticClass sc4 = new StaticClass();
		
		System.out.println("3 : " + sc1.getInt());
		
		sc1.setInt(300);
		
		System.out.println("4 : " + sc1.getInt());
		System.out.println("5 : " + sc2.getInt());
		System.out.println("6 : " + sc3.getInt());
		System.out.println("7 : " + sc4.getInt());
		
		System.out.println(sc1.hashCode());
		System.out.println(sc2.hashCode());
		System.out.println(sc3.hashCode());
		
	}

}
