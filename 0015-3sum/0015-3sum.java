class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set= new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i]+nums[j]);
                if(set.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> triplets=new ArrayList<>();
        for(List<Integer> i: ans){
            triplets.add(i);
        }
        return triplets;
        
    }
}