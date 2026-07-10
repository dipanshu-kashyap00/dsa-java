package Arrays;

public class SortColor {
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int one = 0;
        while (one <= end) {
            if (nums[one] == 2) {
                swap(nums, one, end);
                end--;
            } else if (nums[one] == 1) {
                one++;
            } else if (nums[one] == 0) {
                swap(nums, one, start);
                start++;
                one++;
            }
        }

    }
}
