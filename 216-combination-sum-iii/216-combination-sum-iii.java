class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean[] bl = new boolean[9];
        int nofq = k;
        int sum = 0;
        int target = n;
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> li1 = new ArrayList<>();
        print(bl, nofq, 0, 0, sum, li, li1, target);
        return li1;
    }

    public static void print(boolean[] bl, int nofq, int cqs, int idx, int sum, List<Integer> li, List<List<Integer>> li1, int target) {
        if (nofq == cqs) {
            if (sum == target) {
                li1.add(new ArrayList<>(li));
                return;
            } else {
                return;
            }
        }

        for (int i = idx; i < bl.length; i++) {
            if (bl[i] == false) {
                bl[i] = true;
                li.add(i + 1);
                print(bl, nofq, cqs + 1, i + 1, sum + (i + 1), li, li1, target);
                li.remove(li.size() - 1);
                bl[i] = false;
            }
        }
    }
}
