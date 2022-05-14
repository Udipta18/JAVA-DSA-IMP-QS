class Solution {
    public int[] searchRange(int[] nums, int target) {
       return print(nums,target);
    }
    
    public static int[] print(int[] nums,int target) {
		
		int[] ans=new int[2];
		int i=0;
		int j=nums.length-1;
		while(i<=j) {
			
			int mid=(i+j)/2;
			
			if(nums[mid]==target) {
				int left=mid;
				int right=mid;
				i=mid;
			     j=mid;
				
				while(  left-1>=0 && nums[left-1]==target ) {
					i=left-1;
					left=i;
				}
				
				while(right+1<nums.length &&nums[right+1]==target  ) {
					j=right+1;
					right=j;
					
				}
				
				ans[0]=i;
				ans[1]=j;
				
				return ans;
			}
			
			if(nums[mid]<target)
			{
				i=mid+1;
			}
			else {
				j=mid-1;
			}
			
			
		}
		
		ans[0]=-1;
		ans[1]=-1;
		return ans;
	}
}