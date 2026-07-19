package PrefixSum;

import java.util.HashMap;

public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            max = Math.max(max, freq);
        }
        int sum = 0;
        for (int value : map.values()) {
            if (value == max) {
                sum += value;
            }
        }
        return sum;
    }

}
