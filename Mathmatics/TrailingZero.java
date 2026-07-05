
package Mathmatics;

//on leetcode 172
// Given an integer n, return the number of trailing zeroes in n!.

// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

// Example 1:

// Input: n = 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.
// Example 2:

// Input: n = 5
// Output: 1
// Explanation: 5! = 120, one trailing zero.
// Example 3:

// Input: n = 0
// Output: 0

// Constraints:

// 0 <= n <= 104
// Follow up: Could you write a solution that works in logarithmic time complexity?

public class TrailingZero {
    public static int trailingZeroes(int n) {
        int trailingZeroCount = 0;
        while (n > 0) {
            n = n / 5;
            trailingZeroCount += n;
        }
        return trailingZeroCount;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(1234));
    }

}

// bruteforce approach
// class Solution {
// public int fact(int n){
// if(n==0 || n==1){
// return 1;
// }
// return n * fact(n-1);
// }

// public int trailingZeroes(int n) {

// int trailingZeroCount = 0;
// int fact = fact(n);
// while (fact % 10 == 0 && fact != 0) {
// trailingZeroCount++;
// fact = fact / 10;
// }
// return trailingZeroCount;
// }
// }