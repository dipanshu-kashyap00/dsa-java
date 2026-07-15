package HashSet;

import java.util.HashSet;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

}

// but below solution is more efficient

// class Solution {
// public int missingNumber(int[] nums) {
// int expectedSum = n * (n + 1) / 2;
// int actualSum = 0;int n = nums.length;

// for (int num : nums) {
// actualSum += num;
// }
// return expectedSum - actualSum;
// }
// }