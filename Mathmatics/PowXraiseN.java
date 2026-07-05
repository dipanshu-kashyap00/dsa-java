// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

// Constraints:

// -100.0 < x < 100.0
// -231 <= n <= 231-1
// n is an integer.
// Either x is not zero or n > 0.
// -104 <= xn <= 104

package Mathmatics;

public class PowXraiseN {
    public static double myPow(double x, int n) {
        double res = 1;
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = Math.abs(p);
        }
        while (p > 0) {
            if (p % 2 == 0) {
                x = x * x;
                p = p / 2;
            } else {
                res *= x;
                p--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 20));

    }

}