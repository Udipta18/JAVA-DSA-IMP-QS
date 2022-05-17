class Solution {

    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        int str=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,1);
        for(int i=0;i<nums.length;i++){
               str+=nums[i];
            if(hmap.containsKey(str-k)){
                 count+=hmap.get(str-k);
              
            }
            
            hmap.put(str,hmap.getOrDefault(str,0)+1);
        
        
        
        }
        
        return count;
        
        
    }
}
