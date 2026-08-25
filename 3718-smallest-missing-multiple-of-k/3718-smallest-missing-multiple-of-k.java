class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int x = k; ; x += k) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == x) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return x;
            }
        }
    }
}