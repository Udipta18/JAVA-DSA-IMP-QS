class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
             int[] merged = new int[n + m];
        int i = 0, i1 = 0, i2 = 0;
        while (i < merged.length && i1 < m && i2 < n) {
            if (nums1[i1] > nums2[i2]) {
                merged[i++] = nums2[i2++];
            } else {
                merged[i++] = nums1[i1++];
            }
        }
        while (i1 < m) {
            merged[i++] = nums1[i1++];
        }
        while (i2 < n) {
            merged[i++] = nums2[i2++];
        }
        System.arraycopy(merged, 0, nums1, 0, merged.length);
}}
