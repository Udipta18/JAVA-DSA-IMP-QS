class Solution {

    public int calPoints(String[] ops) {
        Integer topel = null;
        Integer secondel = null;

        Stack<Integer> st = new Stack<Integer>();

        for (String op : ops) {
            switch (op.toCharArray()[0]) {
                case 'C':
                    st.pop();
                    break;
                case 'D':
                    topel = st.peek();
                    st.push(2 * topel);
                    break;
                case '+':
                    topel = st.pop();
                    secondel = st.peek();
                    st.push(topel);
                    st.push(topel + secondel);
                    break;
                default:
                    st.push(Integer.parseInt(op));
                    break;
            }
        }
        
        int ans=0;
        while(!st.isEmpty()){
          ans+=st.pop();
        }
        
        return ans;
    }
}
