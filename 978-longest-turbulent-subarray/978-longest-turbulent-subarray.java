class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int ans=1;
        int start=0;
        int end=0;
        int len=arr.length;
        
        while(start+1<len){
            if(arr[start]==arr[start+1]){
                start++;
                continue;
            }
            
            end=start+1;
            
            while(end+1<len && check(arr,end)) {
               end++;
            }
            
            ans=Math.max(ans,end-start+1);
            start=end;
        }
        
        return ans;
    }
    
    public boolean check(int[] arr,int end){
             
        
        return (arr[end]>arr[end+1] && arr[end]>arr[end-1] || arr[end]<arr[end+1] && arr[end]<arr[end-1]);
    }
}