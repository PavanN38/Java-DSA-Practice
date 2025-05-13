package dynamicprogrammin;

import java.util.Arrays;

public class LongestPrefixProblem {

public static void main(String[] args) {
	
	String prefix=longestCommonPrefix( new String[]{"flower", "flow", "flotw"});
	System.out.println(prefix);
}

public static String longestCommonPrefix(String[] strs) {
	
	if(strs==null || strs.length==0) return "";
	
	String result=strs[0];
	
	for(int i=0; i< strs.length; i++) {
		
		while (!strs[i].startsWith(result)) {
			
			result= result.substring(0,  result.length()-1);
			
			if(result.isEmpty()) return "";
		}
		
		
	}
	
	return result;
	
	
}
}
