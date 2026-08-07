class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for (int i:weights){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int load=0;
            int day=0;
            for(int i:weights){
                if(load+i<=mid){
                    load+=i;
                }
                else{
                    day++;
                    load=i;
                }
                if(day>=days) break;
            }
            if(day>=days) low=mid+1;
            else high=mid-1;
        }
        return low;
        
    }
}