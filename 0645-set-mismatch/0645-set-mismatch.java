class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);

            if (nums[n - 1] > 0) {
                nums[n - 1] = -nums[n - 1];
            } 
            else ans[0] = n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[1] = i + 1; 
                break;
            }
        }

        return ans;
    }
}