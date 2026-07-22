class Solution {
    int carry=0;
    public int[] plusOne(int[] nums) {
        int n=nums.length-1;
        for( int i=n;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
            
        }
        int [] ans=new int[n+2];
        ans[0]=1;
        return ans;
        
    }
}