class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int len = nums.length;
        
        // Find the maximum element in nums to determine the size of 'a'
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Create frequency array based on the maximum element in nums
        int[] a = new int[max + 1];
        
        // Count the occurrences of each element in nums
        for (int i = 0; i < len; i++) {
            a[nums[i]]++;
        }

        // Check if any element occurs more than 3 times
        for (int i = 0; i <= max; i++) {
            if (a[i] >= 3) {
                return false;
            }
        }

        return true;
    }
}
