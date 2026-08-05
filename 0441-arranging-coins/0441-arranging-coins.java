class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            long p=1L*mid*(mid+1)/2;
            if(p<=n){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
}