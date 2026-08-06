class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(1L*bloomDay.length<1L*m*k) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0;
            int b=0;
            for(int i:bloomDay){
                if(i>mid){
                    b+=count/k;
                    count=0;
                }
                else{
                    count++;
                }
            }
            b+=count/k;
            if(b>=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}