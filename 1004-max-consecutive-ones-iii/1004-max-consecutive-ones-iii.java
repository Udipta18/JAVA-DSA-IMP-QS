class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int flip=0;
        int leng=0;
        while(j<nums.length){
            if(nums[j]==1){
                j++;
            }
            else{
                   if(flip<k){
                       flip++;
                       j++;
                       
                   }
                else{
                    
                    while(flip>=k){
                        if(nums[i]==0){
                           flip--;
                        }
                        
                        i++;
                    }
                }
            
            
            }
            
            leng=Math.max(leng,j-i);
        }
        
        return leng;
    }
}