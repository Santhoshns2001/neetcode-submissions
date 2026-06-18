class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freq= new HashMap<>();
        int []result = new int[k];

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int i=0;i<k;i++){
            int maxKey=0;
            int maxFreq=0;
            for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
                if(entry.getValue()>maxFreq){
                    maxKey=entry.getKey();
                    maxFreq=entry.getValue();
                }
            }
            result[i]=(maxKey);
            freq.remove(maxKey);

        }

        return result;
        
    }
}
