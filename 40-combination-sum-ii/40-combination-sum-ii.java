class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        		Arrays.sort(arr);
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(arr,target,0,li,li1);
        return li1;
    }
    public static void print(int[] arr,int target,int idx,List<Integer> li, List<List<Integer>> li1) {
		
		if(target==0){
            li1.add(new ArrayList<>(li));
            return;
        }
		
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i]==arr[i-1]) {
				continue;
			}
			
			if(target>=arr[i]) {
				li.add(arr[i]);
				print(arr,target-arr[i],i+1,li,li1);
				li.remove(li.size()-1);
			}
			
			
		}
}
}