class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        int low=1;
        int high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sq=1L*mid*mid;
            if(sq == num) return true;
            else if( sq>num) high=mid-1;
            else low=mid+1; 
        }
        return false;
        
    }
}