package Mathmatics;

public class AddDigits {
    public static int DigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum; 

    }

    public static void main(String[] args) {
        // System.out.println(DigitSum(38));
        int num = 38;
        while(num>9){
            DigitSum(num);
        }

    }
}