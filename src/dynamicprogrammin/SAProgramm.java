package dynamicprogrammin;

public class SAProgramm {
	
	public static void main(String[] args) {
		 int[] arr = {10, 2, -2, -20, 10,-20};
	        int k = -10;
	        System.out.println(countSubarrays(arr, k));
	}
	
	 static int countSubarrays(int[] arr, int k) {
		int result=0;
		 for( int i =0; i< arr.length; i++) {
			 int sumValue=0;
			 
			 for( int j=i; j<arr.length;j++) {
				 
				sumValue+=arr[j];
				if(sumValue==k) {
					result++;
				}
			 }
					  
			 
		 }
		return result;
	        
	    }

}
