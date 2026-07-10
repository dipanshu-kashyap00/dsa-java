package Arrays;

import java.util.ArrayList;

public class InterseectionOfTwoArrayII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int temp[] = new int[1001];
        for (int val : nums1) {
            temp[val]++;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int val : nums2) {
            if (temp[val] > 0) {
                list.add(val);
                temp[val]--;
            }
        } 
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
 
    }   

    public static void main(String[] args) {

    }

}

// code is cortrect but MLE probblem not efficient
// class Solution {
// public int[] intersect(int[] nums1, int[] nums2) {
// int res[] = new int[1000];
// for(int i =0 ;i<nums1.length;i++){
// int start = 0;
// int end = nums2.length-1;
// while(start<=end){
// int mid = start + (end - start)/2;
// if(nums2[mid] == nums1[i]){
// res[i] = nums1[i];
// }else if(nums2[mid] > nums1[i]){
// end = mid -1;
// }else{
// start = mid+1;
// }
// }

// }
// return res;
// }
// }