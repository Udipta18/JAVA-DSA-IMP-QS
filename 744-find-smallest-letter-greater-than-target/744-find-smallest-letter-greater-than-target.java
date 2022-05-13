class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target){
            return letters[0];
        }
        
        int ans=(print(letters,target));
        
		if(ans==-1) {
			return letters[0];
		}
		else {
			return letters[ans];
		}
    }
    public static int print(char[] letters,char target) {
		int lo=0;
		int hi=letters.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(letters[mid]<=target) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		
		return lo;
	}
}