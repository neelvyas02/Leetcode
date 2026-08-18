class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == 1) {
            int ans = -1;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }
            return ans;
        }
        if (k == n) {
            int ans = nums[0];
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        }
        int ans = -1;
        int countFirst = 0;
        for (int i = 0; i < n; i++) {
            if (nums[0] == nums[i]) {
                countFirst++;
            }
        }
        if (countFirst == 1) {
            ans = Math.max(ans, nums[0]);
        }
        int countLast = 0;
        for (int i = 0; i < n; i++) {
            if (nums[n - 1] == nums[i]) {
                countLast++;
            }
        }
        if (countLast == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        return ans;
    }
}