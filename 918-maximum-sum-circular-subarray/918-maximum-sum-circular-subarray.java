class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return Circular_Subarray(nums);
    }
    public static int Circular_Subarray(int []arr) {
		int linear_sum=maxSubArraySum(arr);
		int total_sum=0;
		for (int i = 0; i < arr.length; i++) {
			total_sum+=arr[i];
			arr[i]*=-1;
		}
		
		int mid_sum= maxSubArraySum(arr);
		int cir_sum=total_sum+mid_sum;
        if(cir_sum==0){

        return linear_sum; 
            }
		return Math.max(linear_sum, cir_sum);
		
		
	}

	public static int maxSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(curr_sum, ans);
			// change the Subarray
			if (curr_sum < 0) {
				curr_sum = 0;
			}

		}
		return ans;
	}
}