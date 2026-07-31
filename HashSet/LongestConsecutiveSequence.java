package HashSet;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        int longConsSequence = 1;
        for (int num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            } else {
                int currNum = num;
                int currConsqSeq = 1;
                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currConsqSeq++;
                }
                longConsSequence = Math.max(longConsSequence, currConsqSeq);
            }
        }
        return longConsSequence;
    }
}
