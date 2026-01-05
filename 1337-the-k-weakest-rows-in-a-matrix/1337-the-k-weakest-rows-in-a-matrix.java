import java.util.*;

class Solution {

    // Binary search to count 1s in a row
    private int countOnes(int[] row) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // number of 1s
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        int rows = mat.length;
        int[][] arr = new int[rows][2];

        for (int i = 0; i < rows; i++) {
            arr[i][0] = countOnes(mat[i]); // soldier count
            arr[i][1] = i;                // row index
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i][1];
        }

        return res;
    }
}
