class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            max=Math.max(max,i);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=0;
            for(int i:piles){
                total+= Math.ceil((double)i/mid); 
            }
            if(total<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
    }
}