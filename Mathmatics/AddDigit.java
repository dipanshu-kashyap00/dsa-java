package Mathmatics;

//Optimized 258

public class AddDigit {

    public static int addDigit(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 9 == 0) {
            return 9;
        }
        return n % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigit(1234));
    }
}

// //Brute-force approach
// public class AddDigit {
// public static int addDigit(int num) {
// int sum = 0;
// while (num != 0) {
// int lastdigit = num % 10;
// sum += lastdigit;
// num /= 10;
// }
// return sum;
// }
// public static int AddDig(int n) {
// while (n > 9) {
// n = addDigit(n);
// }
// return n;

// }