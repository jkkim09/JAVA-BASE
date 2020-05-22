package java_test.testCode;

public class TestSystem {
	public static TestOut testOut = null;
	
	private TestSystem () {
	}
	
	public static void systemInit () {
		if (testOut == null) {
			testOut = new TestOut();
		}
	}
}
