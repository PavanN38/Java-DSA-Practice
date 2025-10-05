package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(findFibinocci(3));

	}

	private static int findFibinocci(int i) {
		if(i<=1)
			return i;
		return findFibinocci(i-1)+findFibinocci(i-2);
	}

}
