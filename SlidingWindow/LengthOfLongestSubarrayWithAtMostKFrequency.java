package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFrequency {

    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int maxSize = 0;
        for (int end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while (map.get(nums[end]) > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }
            maxSize = Math.max(maxSize, end - start + 1);
        }
        return maxSize;
    }

}
