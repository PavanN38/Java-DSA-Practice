package streams;

import java.util.Arrays;
import java.util.List;

public class StartingWith1 {

	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		//adding stream operationsf
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
