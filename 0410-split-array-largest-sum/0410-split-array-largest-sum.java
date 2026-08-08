class Solution {
    public int splitArray(int[] nums, int k) {
        int low=nums[0];
        int high=0;
        for( int i: nums){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum=0;
            int count=1;
            for(int i:nums){
                if(sum+i<=mid){
                    sum+=i;
                }
                else{
                    sum=i;
                    count++;
                }
                if(count>k) break;
            }
            if(count>k) low=mid+1;
            else high=mid-1;
        }
        return low;
        
    }
}