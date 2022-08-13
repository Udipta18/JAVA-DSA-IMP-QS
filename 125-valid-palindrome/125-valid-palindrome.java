class Solution {
    static boolean isPalindrome(String str) {
        //removing all spaces and other symbols
        String actual = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        //two pointers from start and end 
        for(int i = 0;i<actual.length()/2;i++){
            char start = actual.charAt(i);
            char end = actual.charAt(actual.length()-1-i);
            if (start != end) {
                return false;
            }
        }
        return true;

    }
}