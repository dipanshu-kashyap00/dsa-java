package Strings;

public class lengthOfLastWordOfString {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String arr[] = s.split(" ");
        return arr[arr.length - 1].length();
    }

}

// good solution

// class Solution {
// public int lengthOfLastWord(String s) {
// s = s.trim();
// int count =0;
// for(int i = s.length()-1;i>=0;i--){
// if(s.charAt(i)!=' '){
// count++;
// }else{
// break;
// }
// }
// return count;
// }
// }