import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] nums) {
        Set<Integer> data = new LinkedHashSet<>();

        int len = nums.length;

        for (int num : nums) {
            data.add(num);
        }

        int setLen = data.size();

        if (setLen > len / 2) {
            return len / 2;
        } else {
            return setLen;
        }
    }
}
