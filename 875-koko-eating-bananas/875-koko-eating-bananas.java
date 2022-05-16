class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=0;
        for(int pile:piles){
             j=Math.max(j,pile);
        }
        
        while(i<j){
            int mid=i+(j-i)/2;
            if(!isPossible(piles,h,mid)){
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