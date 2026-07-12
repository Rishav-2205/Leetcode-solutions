class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans =new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)) ans.add(i);
        }
        return ans;
        
        
    }
    public static boolean check(int x){
        int n=x;
        while(n>0){
            int a =n%10;
            if(a==0 || x%a!=0)return false;
            n=n/10;
        }
        return true;
    }
   
}