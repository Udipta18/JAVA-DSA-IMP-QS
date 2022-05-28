class Solution {

    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int secmax = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < secmax) return true;

            while (!st.isEmpty() && nums[i] > st.peek()) {
                secmax = Math.max(secmax, st.pop());
            }
            st.push(nums[i]);
        }

        return false;
    }
}
