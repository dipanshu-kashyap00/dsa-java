package Arrays;

public class FindMissingAndReapeatedValue {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int freq[] = new int[grid.length * grid.length + 1];
        for (int[] row : grid) {
            for (int val : row) {
                freq[val]++;
            }
        }
        int res[] = new int[2];
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if (freq[i] == 2) {
                res[0] = i;
            }
            if (freq[i] == 0) {
                res[1] = i;
            }
        }

        return res;
    }
}
