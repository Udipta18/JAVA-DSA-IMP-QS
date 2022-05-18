class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int i=1;
        int j=0;
        for(int num:nums){
             j=Math.max(j,num);
        }
        
        while(i<j){
            int mid=i+(j-i)/2;
            if(!isPossible(nums,threshold,mid)){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        
        
        return i;
    }
      public static boolean isPossible(int[] piles,int h,int mid){
        int ans=0;
        for(int pile:piles){
             ans+=pile/mid;
            if(pile%mid!=0){
                ans++;
            }
        }
        
        return (ans<=h);
    }
}