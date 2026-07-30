class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sB = new StringBuilder();
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                sB.append(Character.toLowerCase(ch));
            }
        }
        n= sB.length();
        for(int i = 0 ; i<n/2 ; i++){
            char chF = sB.charAt(i);
            char chL = sB.charAt(n-i-1);
            if(chF != chL) return false ;
        }
        return true ;
    }
}