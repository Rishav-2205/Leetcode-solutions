class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high = mat[0].length-1;
        int ans[]=new int [2];
        while(low<=high){
            int mid= low+(high-low)/2;
            int row=maxel(mat,mid);
            int left=(mid-1>=0) ? mat[row][mid-1]:-1;
            int right = (mid+1<mat[0].length) ? mat[row][mid+1] : -1;
            if(left<mat[row][mid] && right<mat[row][mid]) return new int[]{row,mid};
            else if(left<mat[row][mid] && right> mat[row][mid]) low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1,-1};
        
    }
    static int maxel(int [][] mat,int mid){
        int ele=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>ele){
                ele=mat[i][mid];
                ind=i;
            }
        }
        return ind;
    }
}