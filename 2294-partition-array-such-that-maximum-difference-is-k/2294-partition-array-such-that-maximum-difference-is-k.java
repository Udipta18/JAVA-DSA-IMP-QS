class Solution {

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int min = nums[0]; //obvious
        int max;

        int result = 1; //intially our whole array is a subsequence for us

        for (int i = 1; i < nums.length; i++) {
            // we have to traverse ahead till the min and the max difference is smaller than that of k
            // so that we can get the max of our first subsequence and thereon further subsequences

            max = nums[i];

            if (
                (max - min) > k
            ) { // if it exceeds - we will have to make a new subsequence
                result++;

                // and when getting to another subsequence, we will also have to update our min value

                min = nums[i];
            }
        }

        return result;
    }
}
