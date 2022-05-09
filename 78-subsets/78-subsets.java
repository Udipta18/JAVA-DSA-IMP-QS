class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>(); 
        print(nums,0,li,li1);
        return li1;
    }
    
    public static void print(int[] nums,int idx, List<Integer> li, List<List<Integer>> li1){
        
        if(idx==nums.length){
            li1.add(new ArrayList<>(li));
            return;
        }
        
        print(nums,idx+1,li,li1);
        li.add(nums[idx]);
        print(nums,idx+1,li,li1);
        li.remove(li.size()-1);
    }
}