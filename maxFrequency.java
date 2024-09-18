public class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int maxnum = Integer.MIN_VALUE;

        int len = nums.length;

        // Find the maximum number in the array to determine the size of the count array
        for (int i = 0; i < len; i++) {
            maxnum = Math.max(maxnum, nums[i]);
        }

        // Initialize count array with size maxnum + 1 to avoid index out-of-bounds
        int count[] = new int[maxnum + 1];

        // Count the frequency of each element
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
        }

        // Find the maximum frequency
        for (int i = 0; i <= maxnum; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }

        // Count the total number of occurrences of elements with the maximum frequency
        int totalElementsWithMaxFrequency = 0;
        for (int i = 0; i <= maxnum; i++) {
            if (count[i] == maxCount) {
                totalElementsWithMaxFrequency += count[i];
            }
        }

        // Return the total number of occurrences of elements with the maximum frequency
        return totalElementsWithMaxFrequency;
    }
}
 maxFrequency {
    
}
