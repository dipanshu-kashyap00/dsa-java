package SlidingWindow;

public class FixSlidingWindowMaxSumSubArrayjava {
    public static int MaxSumSubArray(int nums[], int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int nums[] = { 6, 9, 18, 2, 17, 19 };
        int k = 3;
        System.out.println(MaxSumSubArray(nums, k));
    }
}