
package ArrayList;

import java.util.*;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int end = 0;
        while (end != nums.length) {
            int start = end;
            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }
            if (start != end) {
                res.add(nums[start] + "->" + nums[end]);
            } else {
                res.add(nums[start] + "");
            }
            end++;
        }
        return res;
    }

}
