import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if any number has a count of 3 or more
        for (int count : map.values()) {
            if (count >= 3) {
                return false;
            }
        }

        return true;
    }
}
