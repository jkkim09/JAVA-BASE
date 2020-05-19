package java_test.accessModifier.protectedPack;

import java_test.accessModifier.TestClass;

public class ProtectedTest {

	public static void main(String[] args) {
		TestClass tc = new TestClass(200);
		System.out.println(tc.proValue);
	}

}
