class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(ans.size() == 0 || arr[i][0] > ans.get(ans.size()-1)[1]) {
            ans.add(arr[i]);
           }
           else{
                ans.get(ans.size()-1)[1]=Math.max( ans.get(ans.size()-1)[1],arr[i][1]);
            }
           
        }
        int newarr[][]=new int[ans.size()][2];
        int i=0;
        for(int []n:ans){
            newarr[i]=n;
            i++;
        }
        return newarr;


        
        
        
    }
}