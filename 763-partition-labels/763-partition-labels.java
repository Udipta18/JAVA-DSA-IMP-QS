class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> li=new ArrayList<>();
        int[] arr=new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        
        int k=0;
        while(k<s.length()){
            
            char st=s.charAt(k);
            int last=arr[st-'a'];
            
            for(int j=0;j<=last;j++){
                last=Math.max(last,arr[s.charAt(j)-'a']);
            }
            
            li.add(last-k+1);
            k=last+1;
        }
        
        return li;
    }
}