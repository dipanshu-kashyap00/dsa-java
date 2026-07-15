package Arrays;

//Optimise Solution almost 1ms
class SquareOfSortyedArray{
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[k] = nums[right] * nums[right];
                right--;
            } else {
                res[k] = nums[left] * nums[left];
                left++;
            }
            k--;
        }
        return res;
    }
}

// Brute Force approcah. 11ms

// public class SquareOfSortyedArray {
// public int[] sortedSquares(int[] nums) {
// int squareArray[] = new int[nums.length];
// for (int i = 0; i < nums.length; i++) {
// squareArray[i] = nums[i] * nums[i];
// }
// Arrays.sort(squareArray);
// return squareArray;

// }
// }
