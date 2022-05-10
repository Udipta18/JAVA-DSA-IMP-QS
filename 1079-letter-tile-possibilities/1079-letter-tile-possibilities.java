class Solution {
    public int numTilePossibilities(String tiles) {

        int[] arr=new int[26];
        
        for (char c : tiles.toCharArray()) arr[c - 'A']++;
      
        return print(arr);
        
    }
    
    public static int print(int[] arr){
        int count=0;
        
        for(int i=0;i<26;i++){
            
            if(arr[i]==0) 
                continue;
            
            count++;
            arr[i]--;
             count=count+print(arr);
            arr[i]++;
        }
        
        return count;
    }
}