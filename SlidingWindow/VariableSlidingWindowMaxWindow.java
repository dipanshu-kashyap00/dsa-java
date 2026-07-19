package SlidingWindow;

public class VariableSlidingWindowMaxWindow {

    public static int MaxSubArray(int nums[], int target) {
        int start = 0;
        int sum = 0;
        int maxWindow = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end]; // window is expanding

            // while loop bascically it shrinks the window if value of sum is greater than
            // target
            while (sum > target) {
                sum -= nums[start];
                start++;
            }

            // it gives maxwindow it compare index of current element and previous window
            maxWindow = Math.max(maxWindow, end - start + 1);
        }
        return maxWindow;
    }

    public static void main(String[] args) {

        int nums[] = { 0, 1, 3, 9, 6, 4, 5, 1, 1, 1, 2, 3 };
        int target = 5;
        System.out.println(MaxSubArray(nums, target));
    }

}
