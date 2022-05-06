class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
         parenthesis(n,0,0,"",li);
        
        return li;
    }
    
    
    public static void parenthesis(int n,int open,int close,String ans,List<String> li){
        
        if(open==n && close==n){
            li.add(ans);
            return;
        
        }
        
        
        
        if(open<n){
            parenthesis(n,open+1,close,ans+"(",li);
        }
        
        
              if(close<open){
                   parenthesis(n,open,close+1,ans+")",li);
              
              }
    }
}