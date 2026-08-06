class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i:nums){
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i:nums){
                sum+= (i+mid-1)/mid;
                if(sum>threshold) break;
            }
            if(sum>threshold) low=mid+1;
            else high=mid-1;
        }
        return low;
        
    }
}