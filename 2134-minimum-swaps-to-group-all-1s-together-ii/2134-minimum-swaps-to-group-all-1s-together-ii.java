class Solution {
    public int minSwaps(int[] nums) {
        int count=0;
        for(int val:nums){
            if(val==1)
            {
              count++;
            }
        }
        
        int c0=0, ans=0;
        for(int i=0;i<count;i++){
            if(nums[i]==0){
              c0++;
            }
        }
        
        ans=c0;
        
        int n=nums.length;
        for(int i=count;i<2*(nums.length);i++){
            if(nums[i%n]==0){
                c0++;
            }
            if(nums[(i-count)%n]==0){
                c0--;
            }
            
            ans=Math.min(ans,c0);
        }
        
        return ans;
    }
}