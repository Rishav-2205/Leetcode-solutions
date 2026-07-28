class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    // Find the first occurrence of target
    public int firstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;          // Store the index
                right = mid - 1;    // Search on the left side
            } 
            else if (nums[mid] < target) {
                left = mid + 1;     // Search right half
            } 
            else {
                right = mid - 1;    // Search left half
            }
        }

        return ans;
    }

    // Find the last occurrence of target
    public int lastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;          // Store the index
                left = mid + 1;     // Search on the right side
            } 
            else if (nums[mid] < target) {
                left = mid + 1;     // Search right half
            } 
            else {
                right = mid - 1;    // Search left half
            }
        }

        return ans;
    }
}