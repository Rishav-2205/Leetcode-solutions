class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        if(n==arr[n-1]) return n+k;
        if(k<arr[0]) return k;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-mid-1 >=k) high=mid-1;
            else low=mid+1;
        }
        return arr[high] + k - (arr[high]-high-1);
    }
}