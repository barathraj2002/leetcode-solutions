// Last updated: 3/14/2026, 11:51:22 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2 , nums1);
        }
        if(nums1.length == 0 || nums2.length == 0){
            return nums1.length == 0 ?  nums2.length % 2 == 0 ? (double)(nums2[nums2.length/2] + nums2[nums2.length /2 -1]) / 2 : (double)nums2[nums2.length /2 ]: nums1.length % 2 == 0 ? (double)(nums1[nums1.length/2] + nums1[nums1.length /2 -1]) / 2 : (double)nums1[nums1.length /2 ];
        }
        int low = 0;
        int high = nums1.length ;
        int l1 , l2 , r1 , r2 = 0;
        while(low <= high){
            int cut1 = (low + high) / 2;
            int cut2 = (nums1.length + nums2.length)/2 - cut1;

            l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            r1 = (cut1 == nums1.length) ? Integer.MAX_VALUE : nums1[cut1];
            l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            r2 = (cut2 == nums2.length) ? Integer.MAX_VALUE : nums2[cut2];

            if(l1 <= r2 && l2 <= r1){
                return (nums1.length + nums2.length) % 2 == 0 ?  ((Math.max(l1,l2) + Math.min(r1,r2)) / 2.0 ) :  Math.min(r1,r2) / 1.0;
            }
            else if(l1 > r2){
                high = cut1 - 1;
            }
            else if (l2 > r1) {
                low = cut1 + 1;
            }

        }

        return -1;
    }
    
}