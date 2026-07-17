class Solution {
    public int sumOfUnique(int[] nums) {
        int hash[] = new int[101];
        for(int i=0;i<=100;i++){hash[i]=0;}
        int sum=0;
        for(int i=0;i<nums.length;i++){
                hash[nums[i]]++;
        }
        for(int i=0;i<=100;i++){
            if(hash[i]==1){sum=sum+i;}
        }
        return sum;
    }
}