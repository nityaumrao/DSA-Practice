class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0 , j = n-1 , pass = 0 ;
        while(i<n && i<=j){
            char chL = s.charAt(i);
            char chR = s.charAt(j);
            if (chL != chR) {
                    return isPalindrome(s, i + 1, j) ||
                                isPalindrome(s, i, j - 1);
            }
            // if(Character.toLowerCase(chR)!=Character.toLowerCase(chL)){
            //     if(i+1<n && chR == s.charAt(i+1)) i++;
            //     else j--;
            //     pass++;
            //     if(pass>1) return false ;
            //     continue ;
            // }
            i++;
            j--;
        }
        return true ;
    }
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
}
}