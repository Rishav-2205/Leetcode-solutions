class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if((target-'a' < letters[0]-'a') || (target-'a'>letters[letters.length-1]-'a')) return letters[0];
        int low=0;
        int high=letters.length-1;
        char ans=letters[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target-'a'<letters[mid]-'a'){
                high=mid-1;
                ans=letters[mid];
            }
            else low=mid+1;
        }
        return ans;
        
        
    }
}