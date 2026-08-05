class Solution {
    int count ;
    public int countSubstrings(String s) {
        int n = s.length();
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                if (f1(s.substring(i,j+1))) count++;
            }
        }
        return count ;
    }
    private boolean f1(String s ){
        if(s.length()==0) return false ;
        int n = s.length();
        for(int i = 0 ; i<n/2 ; i++){
            if(s.charAt(i)!=s.charAt(n-1-i)) return false ;
        }
        return true ;
    }
}