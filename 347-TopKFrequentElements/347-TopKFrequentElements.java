// Last updated: 3/14/2026, 11:50:36 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k]; 
        for(int i = 0; i< nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);    
        }
        System.out.println(map);
        int count = 0;
        int i = 0;
        while(count < k){
            int key = -1;
            int larger = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int key1 = entry.getKey();
                int value = entry.getValue();
                if(value > larger){
                    larger = value;
                    key = key1;
                    System.out.println("k ->"+key+"v ->"+larger);
                }
            }
            arr[i++] = key;
            map.remove(key);
            count++;
        }
        return arr;
    }
}