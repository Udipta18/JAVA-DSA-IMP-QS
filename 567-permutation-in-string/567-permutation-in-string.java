class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[] ans = new int[26];
        for (int i = 0; i < len1; i++) {
            ans[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = 0;
        while (j < len2) {
            char ch = s2.charAt(j);
            ans[ch - 'a']--;

            while (ans[ch - 'a'] < 0) {
                ans[s2.charAt(i) - 'a']++;
                i++;
            }

            if (j - i + 1 == s1.length()) return true;

            j++;
        }

        return false;
    }
}
