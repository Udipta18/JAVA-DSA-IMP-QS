class Solution {
    public int findMin(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[j]){
               i=mid+1;
            }
            else
                  if(arr[mid]==arr[j]){

                   j--;
                  }
                
                else{
                         j=mid;
                
                }
             
            
            
         
        }
        
        return arr[i];
        
    }
}