class Solution {

    public int[] nextGreaterElements(int[] arr) {
        return NGE(arr);
    }

    public static int[] NGE(int[] arr) {
       int k=arr.length;
        int[] nge = new int[arr.length];
        Arrays.fill(nge,-1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2 * arr.length; i++) {
            // nge
            while (!st.isEmpty() && arr[i%k] > arr[st.peek()]) {
                int ii = st.pop();
                nge[ii] = arr[i%k];
            }

            if(i<k)
            st.push(i);
        }

        return nge;
    }
}
