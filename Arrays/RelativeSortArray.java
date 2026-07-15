package Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[] = new int[1001];
        for (int val : arr1) {
            freq[val]++;
        }
        int k = 0;
        for (int val : arr2) {
            while (freq[val] != 0) {
                arr1[k] = val;
                freq[val]--;
                k++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] != 0) {
                arr1[k] = i;
                freq[i]--;
                k++;
            }
        }
        return arr1;
    }
}