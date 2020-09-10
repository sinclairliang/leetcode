package leetcode;

public class MedianofTwoSortedArrays {
    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * <p>
     * Follow up: The overall run time complexity should be O(log (m+n)).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     * Example 2:
     * <p>
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     * Example 3:
     * <p>
     * Input: nums1 = [0,0], nums2 = [0,0]
     * Output: 0.00000
     * Example 4:
     * <p>
     * Input: nums1 = [], nums2 = [1]
     * Output: 1.00000
     * Example 5:
     * <p>
     * Input: nums1 = [2], nums2 = []
     * Output: 2.00000
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int len = nums1.length + nums2.length;
        int cut1 = 0;
        int cut2 = 0;
        int cutL = 0;
        int cutR = nums1.length;

        return (double) 1.0;
    }
}
