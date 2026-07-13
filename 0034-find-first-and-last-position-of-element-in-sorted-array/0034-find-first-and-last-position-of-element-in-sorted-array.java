class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int low =0;
        int idx=-1;
        int high=nums.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                idx=mid;
                high = mid-1;
            }
            else if (nums[mid]>target){
                high = mid-1; }
            else{
                low=mid+1;
            }
            
        }
        arr[0]=idx;
        idx=-1;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                idx=mid;
                low=mid+1;
            }
            else if (nums[mid]<target){
                low=mid+1; }
            else{
                high=mid-1;
            }

            
        }
        arr[1]=idx;
        return arr;
    
        
    }
}