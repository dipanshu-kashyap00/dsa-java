package Arrays;

public class RemoveDuplicateInSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int end = 1; end < nums.length; end++) {
            if (nums[i] != nums[end]) {
                i++;
                nums[i] = nums[end];
            }
        }
        return i + 1;
    }
}
