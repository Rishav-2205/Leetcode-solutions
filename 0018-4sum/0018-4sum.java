class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for( int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum =0;
                    sum+= (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum>(long)target) l--;
                    else if( sum <(long)target) k++;
                    else{
                        List<Integer> temp = new ArrayList(List.of(nums[i],nums[j],nums[k],nums[l]));
                        ans.add(temp);
                        l--;
                        k++;
                        while(l>k && nums[l]==nums[l+1]) l--;
                        while(l>k && nums[k]==nums[k-1]) k++;
                    }
                }
            }
        }
        return ans;
        
    }
}