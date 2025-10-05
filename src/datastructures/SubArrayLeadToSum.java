package datastructures;

import java.util.HashMap;

public class SubArrayLeadToSum {

	public static void main(String[] args) {
System.out.println(subArrayToSumValue(new int[] {2,1,1,-2,1}, 2));

	}

	private static int subArrayToSumValue(int[] nums, int i) {
		HashMap<Integer, Integer> mapsWithSumAndCount=new HashMap<>();
		mapsWithSumAndCount.put(0, 1);
		int count=0, currentSum=0;
		for(int number: nums) {
			
			currentSum+=number;
			if(mapsWithSumAndCount.containsKey(currentSum-i)) {
				count+=mapsWithSumAndCount.get(currentSum-i);
				
			}
			mapsWithSumAndCount.put(currentSum, mapsWithSumAndCount.getOrDefault(currentSum, 0)+1);
			
		}
		return count;
	}

}
