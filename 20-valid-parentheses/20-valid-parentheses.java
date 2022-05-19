class Solution {

   public static  boolean isValid(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<ch.length;i++){

           if(st.isEmpty() || ch[i]=='(' || ch[i]=='{' || ch[i]=='['){

               st.push(ch[i]);
           }
            else{

               if(!st.isEmpty() && st.peek()=='(' && ch[i]==')'){
                      st.pop();
               }
                else{
                	if(ch[i]==')')
                    st.push(ch[i]);
                }
                
               if(!st.isEmpty() && st.peek()=='{' && ch[i]=='}'){
                      st.pop();
               }
                else{
                	if(ch[i]=='}')
                    st.push(ch[i]);
                }
               if(!st.isEmpty() && st.peek()=='[' && ch[i]==']'){
                      st.pop();
               }
                else{
                	if(ch[i]==']')
                    st.push(ch[i]);
                }
            
            }
        
        }
        
        if(st.isEmpty()) return true;
        
        return false;
    }
}