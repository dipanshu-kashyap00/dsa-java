// package BinarySearch;

// // //Leetcode 374. Guess Number Higher or Lower
// // public class Guess_Number_higher_or_Lower{
    
// //     /** 
// //  * Forward declaration of guess API.
// //  * @param  num   your guess
// //  * @return 	     -1 if num is higher than the picked number
// //  *			      1 if num is lower than the picked number
// //  *               otherwise return 0
// //  * int guess(int num);
// //  */

// public class Guess_Number_higher_or_Lower extends GuessGame{
//     public int guessNumber(int n) {
//          int start=0;
//          int end = n;
//          while(start<=end){
//             int mid = start + (end-start)/2;
//             int g = guess(mid);
//             if(g==0){
//                 return mid;
//             }else if(g==-1){
//                 end = mid-1;
//             }else{
//                 start = mid+1;
//             }
//          }
//          return -1;
//     }
// }

