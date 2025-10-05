package datastructures;

public class SearchInsertIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));

	}
	public static int searchInsert(int[] nums, int target) {
		
		int low=0; int high=nums.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target){
				low=mid+1;
				
			}else {
				high=mid-1;
			}
		}
		
		return low;
	}
	
}
