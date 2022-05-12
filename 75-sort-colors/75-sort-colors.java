class Solution {
    public void sortColors(int[] nums) {
        print(nums);
    }
    public static void print(int[] nums) {
		int left=0;
		int right=nums.length-1;
		int mid=0;
		while(mid<=right) {
			if(nums[mid]==2) {
				reverse(nums,mid,right);
				right--;
			}else
			if(nums[mid]==0) {
				reverse(nums,mid,left);
				left++;
				mid++;
			}
			else {
				mid++;
			}
		}
	}
	
	public static void reverse(int[] nums,int i ,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}