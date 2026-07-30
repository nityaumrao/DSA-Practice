class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sB = new StringBuilder();
        int i = 0 , j = n-1 ; 
        while(i<j){
            char chL = s.charAt(i);
            char chR = s.charAt(j);
            if(!Character.isLetterOrDigit(chL)) {
                i++;
            }else if(!Character.isLetterOrDigit(chR)){
                j--;
            }else if(Character.toLowerCase(chR)!=Character.toLowerCase(chL)){
                return false ;
            }else {
                i++;
                j--;
            }
        }
        return true ;
    }
}