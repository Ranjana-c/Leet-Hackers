public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        
        // Initialize variables
        int jumps = 0;
        int current_end = 0; // The farthest point we can reach with current number of jumps
        int farthest = 0; // The farthest point we can reach in the next step
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we've reached the end of the current jump
            if (i == current_end) {
                jumps++;
                current_end = farthest;
            }
        }
        
        return jumps;
    }
}
