class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.empty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String ans="";
        while(!st.empty()){
             ans=st.pop()+ans;
        }
        
        
        return ans;
    }
}