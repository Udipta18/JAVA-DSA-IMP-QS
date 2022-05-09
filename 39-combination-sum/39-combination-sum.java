class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
         List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(arr,tar,0,li,li1);
        return li1;
        
    }
    public static void print(int[] arr,int tar,int idx, List<Integer> li,List<List<Integer>> li1) {
		
		
		if(tar==0) {
			li1.add(new ArrayList<>(li));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(tar>=arr[i]) {
				li.add(arr[i]);
				print(arr, tar-arr[i], i, li, li1);
				li.remove(li.size()-1);
			}
		}
	}
}