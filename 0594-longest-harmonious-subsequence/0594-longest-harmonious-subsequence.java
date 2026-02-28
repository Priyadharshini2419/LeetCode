class Solution {
    public int findLHS(int[] nums) {
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                maxlen=Math.max(maxlen,map.get(key)+map.get(key+1));
            }
        }
        return maxlen;
    }
}