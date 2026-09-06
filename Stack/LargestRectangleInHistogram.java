package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int width = i - leftBoundary - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

}

// class Solution {
// public int largestRectangleArea(int[] heights) {

// int maxArea = 0;
// int n = heights.length;
// for (int i = 0; i < heights.length; i++) {
// int currentHeight = heights[i];
// int left = i;
// int right = i;
// while (left > 0 && heights[left - 1] >= currentHeight) {
// left--;
// }
// while (right < n-1 && heights[right + 1] >= currentHeight) {
// right++;
// }
// int width = right - left + 1;
// int area = currentHeight * width;
// maxArea = Math.max(maxArea, area);
// }
// return maxArea;

// }
// }