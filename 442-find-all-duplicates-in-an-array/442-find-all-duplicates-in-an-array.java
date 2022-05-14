class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      //  Arrays.sort(nums);
        List<Integer> li=new ArrayList<Integer>();
        //int i=0;
       // int j=1;
      for(int i=0;i<nums.length;i++){
          int idx=Math.abs(nums[i])-1;
          if(nums[idx]<0){
              li.add(Math.abs(nums[i]));
          }
          else{
              nums[idx]=-nums[idx];
          }
      }
        
        return li;
    }
}