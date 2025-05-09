package dynamicprogrammin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakDP {
	public static void main(String[] args) {
		boolean result=wordBreak("", Arrays.asList("pavan","n", "kalyan"));
		
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
	    Set<String> wordSet = new HashSet<>(wordDict);
	    boolean[] dp = new boolean[s.length() + 1];
	    dp[0] = true;  // base case: empty string is "splittable"
	    System.out.println(s.length());

	    for (int i = 1; i <= s.length(); i++) {
	        for (int j = 0; j < i; j++) {
	            String word = s.substring(j, i);
	            
	            if (dp[j] && wordSet.contains(word)) {
	                dp[i] = true;
	                break;  // no need to check more
	            }
	        }
	    }

	    return dp[s.length()];
	}


}
