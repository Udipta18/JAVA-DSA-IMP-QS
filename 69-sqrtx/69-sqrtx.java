class Solution {

    public int mySqrt(int x) {
        int st = 1;
        int la = x;
        int ans = 0;

        while (st <= la) {
            int mid = st + (la - st) / 2;

            if (mid <= x / mid) {
                ans = mid;
                st = mid + 1;
            } else {
                la = mid - 1;
            }
        }

        return ans;
    }
}
