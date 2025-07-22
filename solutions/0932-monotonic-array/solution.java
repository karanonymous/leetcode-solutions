class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;//1
        boolean decreasing = true;//1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}

