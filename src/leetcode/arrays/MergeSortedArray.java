package leetcode.arrays;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead
be stored inside the array nums1. To accommodate this, nums1 has a length
of m + n, where the first m elements denote the elements that should be merged,
 and the last n elements are set to 0 and should be ignored. nums2 has a length
 of n.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
* */
public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums11 = {-1,3,0,0,0,0,0};
        int m1 = 2;
        int [] nums21 = {0,0,1,2,3};
        int n1 = 5;
        System.out.println(Arrays.toString(merge(nums11, m1, nums21, n1)));
    }
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int second = 0;
        while (first!=(n+m)) {
            if (n==0){
                break;
            }
            if (nums1[first]==0 && first>=m){
                nums1[first] = nums2[second];
                second++;
                first++;
                continue;
            }

            if (nums1[first] < nums2[second]){
                if (nums1[first]==0 && first>=m){
                    nums1[first] = nums2[second];
                    second++;
                }
                first++;

            }else if (nums1[first] > nums2[second]){
                int temp = nums1[first];
                nums1[first] = nums2[second];
                nums2[second] = temp;
                Arrays.sort(nums2);
            } else{
                first++;
            }
        }
        return nums1;
    }
}
