class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char [] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            if(chars[left]!=chars[right]){
                return false ;
            }
            left++;
            right--;
        }
        return true ;
        
    }
}