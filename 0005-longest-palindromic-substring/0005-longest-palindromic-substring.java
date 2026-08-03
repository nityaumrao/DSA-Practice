class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int n = s.length() ;
        String pali = s.substring(0,1);
        for(int i = 0 ; i<n ; i++){
            int r = i , l = i+1 ; //odd
                while (r>=0 && l<n){
                    if(s.charAt(r)==s.charAt(l)) {
                        if(pali.length() < (s.substring(r,l+1).length()))
                        pali = s.substring(r,l+1);
                        r--;
                        l++;
                    }
                    else break ;
                }
            r = i-1 ;
            l = i+1 ; //even
                 while (r>=0 && l<n ){
                    if(s.charAt(r)==s.charAt(l)) {
                        if(pali.length()<s.substring(r,l+1).length())
                        pali = s.substring(r,l+1);
                        r--;
                        l++;
                    }
                    else break ;
                }
        }
        return pali ;
    }
    // private boolean f1(String s , int n ){
    //     int i = 0 , j = n -1 ;
    //     while(i<=j){
    //         if(s.charAt(i)==s.charAt(j)){
    //             i++;
    //             j--;
    //         }
    //         else return false ;
    //     }
    //     return true ;
    // }
}