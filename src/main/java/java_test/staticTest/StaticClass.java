package java_test.staticTest;

public class StaticClass {
	static int testInt = 100;
	
	static int getTestInt () {
		return testInt;
	}
	
	public int getInt () {
		return testInt;
	}
	
	public void setInt (int value) {
		testInt = value;
	}
}
