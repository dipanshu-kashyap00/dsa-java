package SlidingWindow;

class CountNumbersOfNiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] % 2;
        }
        return countSub(nums, k) - countSub(nums, k - 1);
    }

    public int countSub(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            // every subarray ending at `end` starting from start..end is valid
            count += right - left + 1;
        }
        return count;
    }
}