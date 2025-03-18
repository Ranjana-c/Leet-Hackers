Approach
Complexity
Time complexity:
Space complexity:
Code
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 0;
        int left = 0;
        int currentAnd = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((currentAnd & nums[right]) != 0) {
                currentAnd ^= nums[left];
                left++;
            }
            currentAnd |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    
        int[] nums1 = {1, 3, 8, 48, 10};
        int result1 = solution.longestNiceSubarray(nums1);
        System.out.println("Longest nice subarray length for [1, 3, 8, 48, 10]: " + result1); 
       
        int[] nums2 = {3, 1, 5, 11, 13};
        int result2 = solution.longestNiceSubarray(nums2);
        System.out.println("Longest nice subarray length for [3, 1, 5, 11, 13]: " + result2); 
    }
}
