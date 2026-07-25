class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int ele1=Integer.MIN_VALUE;int count1=0;
        int ele2=Integer.MIN_VALUE;int count2=0;
       for (int num : nums) {
            if (count1 == 0 && num != ele2) {
                ele1 = num;
                count1 = 1;
            }
            else if (count2 == 0 && num != ele1) {
                ele2 = num;
                count2 = 1;
            }
            else if (num == ele1)
                count1++;
            else if (num == ele2)
                count2++;
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) count1++;
            else if( nums[i]==ele2) count2++;
        }

        if (count1 >nums.length/3)
            ans.add(ele1);

        if (count2 > nums.length/3)
            ans.add(ele2);

        return ans;
    }
}