class Solution {

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> li1 = new ArrayList<>();
        print(nums, li, li1, used);
        return li1;
    }

    public static void print(int[] nums, List<Integer> li, List<List<Integer>> li1, boolean[] used) {
        
        if(li.size()==nums.length){
           li1.add(new ArrayList<>(li));
            return;
                   
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i]==true)
                continue;
            
            used[i]=true;
            li.add(nums[i]);
             print(nums,li,li1,used);
            li.remove(li.size()-1);
            used[i]=false;
           //hile(i+1<nums.length && nums[i]==nums[i+1]){
           //   i++;
          //}
        }
        
    }
}
