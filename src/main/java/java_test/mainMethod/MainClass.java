package java_test.mainMethod;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (String a : args) {
			System.out.println(a);
		}
	}
}
