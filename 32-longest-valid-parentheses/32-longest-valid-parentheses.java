class Solution {

    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty() && s.charAt(st.peek()) == '(') {
                    st.pop();
                } else {
                   st.push(i);
                }
            }
        }

        int maxlen = 0;
        int end = s.length();

        while (!st.empty()) {
            int start = st.pop();
            maxlen = Math.max(maxlen, end - start-1);
            end = start;
        }

        return Math.max(maxlen,end);
    }
}
