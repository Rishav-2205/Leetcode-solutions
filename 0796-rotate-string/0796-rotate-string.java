class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int rotationIndex=0;
        for(;rotationIndex<s.length();rotationIndex++){
            int i=rotationIndex,j=0;
            while(j<s.length() && s.charAt(i)==goal.charAt(j)){
                i = (i+1)%s.length();
                j++;
            }
            if(j == s.length()) return true;
        }
        return false;    
    }

}