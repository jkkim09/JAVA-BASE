package java_test.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraySteam {
	public static void main(String[] args) {
		System.out.println("ArraySteam");
		String[] arr = {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		System.out.println(stream);
	}
}
