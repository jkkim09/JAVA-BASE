package java_test.accessModifier;

public class TestApplication {

	public static void main(String[] args) {
		TestClass tClass = new TestClass(100);
		System.out.println(tClass.pValue);
		System.out.println(tClass.proValue);
		System.out.println(tClass.privateValue);
	}
}
