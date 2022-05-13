class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        return print(nums);
    }
    
    public static int[] print(int[] nums){
         int i=0;
        int j=0;
       while(j<nums.length){
           
             if(nums[j]%2==0){
                     swap(nums,i,j);
                 i++;
                 j++;
             }
           else{
              j++;
           }
         
       }
        return nums;
    
    }
    
    public static void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}