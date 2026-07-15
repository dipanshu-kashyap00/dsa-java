package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int currSum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - currSum) < Math.abs(target - cs)) {
                    cs = currSum;
                }
                if (currSum < target) {
                    start++;
                } else if (currSum > target) {
                    end--;
                } else {
                    return target;
                }
            }
        }
        return cs;
    }
}