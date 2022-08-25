//remove duplicates from sorted array (26.)


public class leetcode26 {
	
	public static int removeDuplicates(int[] nums) {
		//here, I'll use 2 pointer approach 
		//refer : https://www.youtube.com/watch?v=Sxc9oZ3PrFU&list=PL1MJrDFRFiKa6ujcwZcMB8DdNzUg29BXy&index=4
		
		int n = nums.length;
		
		//base case
		if(n < 2)
			return n;
		
		//define pointers
		int left = 0;
		int right = 1;
		
		//remove duplicates in place
		while(right < n) {
			if(nums[left] == nums[right]) {
				right++ ;
			}
			
			else {
				left++ ;
				nums[left] = nums[right];
			}
		}
		
		return left + 1 ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0,0,1,1,1,2,2,3,3,4,5};
		
		System.out.print(removeDuplicates(nums));

	}

}
