class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles){
            max=Math.max(max,i);
        }
        int low=1;
        while(low<=max){
            int mid=low+(max-low)/2;
            int total=0;
            for(int i:piles){
                total+= (i+mid-1)/mid;
                if (total > h) break;
            }
            if(total<=h){
                max=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
    }
}