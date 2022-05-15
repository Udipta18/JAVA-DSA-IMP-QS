
class Solution {

  public int[] findRightInterval(int[][] intervals) {
    int n = intervals.length;
    int[] res = new int[n];
	//because the start value is unique, save s and index in map
    HashMap<Integer, Integer> map = new HashMap<>();
	//save the start
    int[] s = new int[n];
    for (int i = 0; i < n; i++) {
        s[i] = intervals[i][0];
        map.put(s[i], i);
    }
	//sort the start arr
    Arrays.sort(s);
    for (int i = 0; i < n; i++) {
        res[i] = binarySearch(s, map, intervals[i][1]);
    }
    return res;
}

//binarysearch to get the first one who largger than v, and return the index in map
int binarySearch(int[] s, HashMap<Integer, Integer> map, int v) {
    if (v <= s[0]) {
        return map.get(s[0]);
    } else if (v > s[s.length - 1]) {
        return -1;
    }
    int l = 0, r = s.length;
    while (l < r) {
        int mid = (l + r) >>> 1;
        if (s[mid] >= v) {
            r = mid;
        } else {
            l = mid + 1;
        }
    }
    return map.get(s[l]);
}
    }
