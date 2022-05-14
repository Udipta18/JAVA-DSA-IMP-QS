class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<Integer>();
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                j++;
                
                
            }
            else{
                li.add(nums[i]);
                i= i+2;
                j=j+2;
            }
        }
        
        return li;
    }
}