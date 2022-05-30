class Solution {

    public int longestSubstring(String s, int k) {
        int[] freq = new int[26];
        char[] str = s.toCharArray();
        for (char c : str) {
            int idx = c - 'a';
            freq[idx]++;
        }

        boolean valid = true;

        int start = 0;
        int max = 0;
        for (int end = 0; end < s.length(); end++) {
            if ( freq[str[end] - 'a'] > 0 && freq[str[end] - 'a'] < k) {
                String substring = s.substring(start, end);
                max = Math.max(max, longestSubstring(substring, k));
                start = end + 1;
                valid = false;
            }
        }

        if (valid) {
            return s.length();
        } else {
            return Math.max(max, longestSubstring(s.substring(start),k));
        }
    }
}
