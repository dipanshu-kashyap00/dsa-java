package Arrays;

import java.util.*;

public class FindAllDuplicateArray {

    public List<Integer> findduplicate(int[] nums) {
        int freq[] = new int[nums.length + 1];
        List<Integer> res = new ArrayList<>();
        for (int val : nums) {
            freq[val]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
