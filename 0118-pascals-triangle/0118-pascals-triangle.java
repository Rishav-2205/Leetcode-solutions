class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int j=1;j<=numRows;j++){
            ans.add(row(j));
        }
        return ans;

        
    }
    public List<Integer> row(int n){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        if(n==1) return ls;
        int pro=1;
        for( int i=1;i<n;i++){
            pro=pro*(n-i)/i;
            ls.add(pro);
        }
        return ls;
    }
}