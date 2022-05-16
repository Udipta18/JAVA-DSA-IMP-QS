class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int candy:candies){
            
            max=Math.max(max,candy);
        }
        int low=1;
        int high=max;
        
        while(low<high){
           int mid=low+(high-low)/2;
            if(isValid(candies,k,mid)){
                low=mid+1;
            }
            else{
                high=mid;
            }
         
        }
        
        return isValid(candies,k,low)?low:low-1;
    }
    public static boolean isValid(int[] candies,long k,int mid){
         if(mid==0)
             return true;
        
        long totalPiles=0;
        for(int candy:candies){
              totalPiles+=candy/mid;
            
            if(totalPiles>=k){
                   return true;
            }
        
        }
        
        return false;
    }
}