class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
        
    }
    public void transpose(int[][] arr ){
        int n = arr.length;
        for( int i=0;i<n-1;i++){
            for( int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void reverse(int [][] arr){
        int n = arr.length;
        for( int i=0;i<n;i++){
            int j=0;
            int k=n-1;
            while(j<k){
                int temp = arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}