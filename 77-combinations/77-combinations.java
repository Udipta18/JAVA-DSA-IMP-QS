class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean[] bl=new boolean[n];
		int nofq=k;
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(bl,nofq,0,0,li,li1);
         return li1;
        
    }
    public static void print(boolean[] bl,int nofq,int cqs,int idx,List<Integer> li,List<List<Integer>> li1) {
		
		
		if(nofq==cqs) {
			li1.add(new ArrayList<>(li));
			return;
		}
		
		for(int i=idx;i<bl.length;i++) {
			if(bl[i]==false) {
				bl[i]=true;
				li.add(i+1);
				print(bl,nofq,cqs+1,i+1,li,li1);
				li.remove(li.size()-1);
				bl[i]=false;
				
			}
		}
	}
}