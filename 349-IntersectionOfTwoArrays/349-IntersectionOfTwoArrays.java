// Last updated: 3/14/2026, 11:50:35 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        if(nums1.length > nums2.length){
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if(nums2[i] == nums1[j]){
                        set.add(nums2[i]);
                    }
                }
            }
        }
        else{
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if(nums2[j] == nums1[i]){
                        set.add(nums2[j]);
                    }
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}