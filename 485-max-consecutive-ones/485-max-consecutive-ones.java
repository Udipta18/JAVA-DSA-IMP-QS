class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        // int i=0;
        int j = 0;
        int len = 0;
        int c = 0;
        while (j < nums.length) {
            if (nums[j] == 1) {
                c++;
            } else {
                c = 0;
            }

            len = Math.max(len, c);

            j++;
        }

        return len;
    }
}
