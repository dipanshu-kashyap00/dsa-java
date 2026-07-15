package Strings;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res = res - map.get(s.charAt(i));
            } else {
                res = res + map.get(s.charAt(i));
            }
        }
        return res;
    }

}

// Optimise solution

// class Solution {
// public int romanToInt(String s) {
// int sum=0;
// int previousValue=0;
// for(int i=s.length()-1;i>=0;i--){
// int currentValue=getValue(s.charAt(i));
// if(currentValue>=previousValue){
// sum=sum+currentValue;
// } else {
// sum=sum-currentValue;
// }
// previousValue=currentValue;
// }
// return sum;
// }

// public int getValue(char c){
// switch(c){
// case 'I':
// return 1;
// case 'V':
// return 5;
// case 'X':
// return 10;
// case 'L':
// return 50;
// case 'C':
// return 100;
// case 'D':
// return 500;
// case 'M':
// return 1000;
// default:
// }
// return -1;
// }
// }