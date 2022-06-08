class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> m=new HashMap<>();
        int start=0;
        int max=1;
        int currentmax=0;
        for(int fruit:fruits){
            currentmax++;
            m.put(fruit,m.getOrDefault(fruit,0)+1);
            
            while(m.size()>2){
                
                currentmax--;
                int val=m.getOrDefault(fruits[start],0)-1;
                
                if(val<=0)
                {
                    m.remove(fruits[start]);
                }
                
                if(val>0){
                    m.put(fruits[start],val);
                }
                
                start++;
            }
            
            max=Math.max(max,currentmax);
        
        
        }
        
        return max;
    }
}