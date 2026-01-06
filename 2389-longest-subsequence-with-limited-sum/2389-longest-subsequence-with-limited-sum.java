import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            int idx = Arrays.binarySearch(prefix, q);

            if (idx >= 0) {
                ans[i] = idx + 1;
            } else {
                ans[i] = -idx - 1;
            }
        }
        return ans;
    }
}
