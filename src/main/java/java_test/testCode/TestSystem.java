package java_test.testCode;

public class TestSystem {
	public static int a = 100;
	public static int[]b = {1,2,3,4};
	
	public static TestOut testOut = null;
	
	private TestSystem () {
	}
	
	public void getTest () {}
	
	public static void systemInit () {
		if (testOut == null) {
			testOut = new TestOut();
		}
	}
}
