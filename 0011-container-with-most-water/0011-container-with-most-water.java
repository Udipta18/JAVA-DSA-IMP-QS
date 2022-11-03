class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        
        int max=0;
        
        while(left<right){
           int leftVal=height[left];
            int rightVal=height[right];
            max=Math.max(Math.min(leftVal,rightVal)*(right-left),max);
            
            if(leftVal<rightVal)
                left++;
            else
                right--;
        }
        
        return max;
    }
}