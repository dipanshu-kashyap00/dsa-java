package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;

    }

}

// public List<Integer> findDisappearedNumbers(int[] nums) {
// int[] freq = new int[nums.length + 1];
// List<Integer> res = new ArrayList<>();

// for (int val : nums) {
// freq[val]++;
// }

// for (int i = 1; i <= nums.length; i++) {
// if (freq[i] == 0) {
// res.add(i);
// }
// }

// return res;
// }