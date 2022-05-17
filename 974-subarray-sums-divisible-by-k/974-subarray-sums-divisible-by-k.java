class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         
        int count=0;
        int str=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,1);
        for(int i=0;i<nums.length;i++){
               str+=nums[i];
            int rem=str%k;
            if(rem<0) rem+=k;
            if(hmap.containsKey(rem)){
                 count+=hmap.get(rem);
              
            }
            
            hmap.put(rem,hmap.getOrDefault(rem,0)+1);
        
        
        
        }
        
        return count;
        
    }
}