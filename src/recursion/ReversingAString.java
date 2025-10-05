package recursion;

public class ReversingAString {

	public static void main(String[] args) {
		
		//System.out.println("pavan".substring(1));
		System.out.println(reverseAStringWithLoop("any string"));

		System.out.println(reverseAStringWithRecursion(""));
	}

	private static String reverseAStringWithLoop(String string) {
		
		String reverseString="";
		for(int end=string.length()-1; end>=0;end--) {
			
			reverseString+=string.charAt(end);
		}
		return reverseString;
	}
	
	private static String reverseAStringWithRecursion(String str) {
		
		if (str.isEmpty())
			return str;
		
		
	    return reverseAStringWithRecursion(str.substring(1)) + str.charAt(0);
	
	}

}
