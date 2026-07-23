class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max_area = Math.min(height[left], height[right]) * (right-left);
        while (left != right)
        {
            if (height[left] < height[right])
                left++;
            else
                right--;
        if (Math.min(height[left],height[right]) * (right-left) > max_area)
            max_area = Math.min(height[left],height[right]) * (right-left);
        }
        return max_area;
    }
}