package java_test.testCode;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(TestSystem.a);
		System.out.println(TestSystem.b.hashCode());
		int[] c = TestSystem.b;
		System.out.println(c.hashCode());
		for (int i : TestSystem.b) {
			System.out.println(i);
		}
		TestSystem.systemInit();
		TestSystem.testOut.testPrintln("testCode");
		
	}

}
