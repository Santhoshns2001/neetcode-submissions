class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums.length<=0) return false;

        Map<Integer,Integer> map = new HashMap<>();

        for (int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (int value :map.values()){
            if(value>1){
                return true;
            }
        }
        return false;
        
    }
}