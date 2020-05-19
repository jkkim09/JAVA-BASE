package java_test.accessModifier.protectedPack;

import java_test.accessModifier.TestClass;

public class ProtectedTest extends TestClass {

	public ProtectedTest(Integer value) {
		super(value);
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass(200);
		System.out.println(tc.pValue);
		System.out.println(tc.proValue);
		ProtectedTest pt = new ProtectedTest(300);
		System.out.println(pt.proValue);
	}

}
