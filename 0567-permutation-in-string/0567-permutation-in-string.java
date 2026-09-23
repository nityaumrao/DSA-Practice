class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();   
        int n = s1.length();
        int m = s2.length();     
        if(n<=m){
            for(int i = 0 ; i<s1.length() ; i++){
                map.put(s1.charAt(i) , map.getOrDefault(s1.charAt(i),0)+1);
                map2.put(s2.charAt(i) , map2.getOrDefault(s2.charAt(i),0)+1);
            } 
        }else return false ;
        if(map.equals(map2)) return true ;

        for(int i = n ; i<m ; i++){
            map2.put(s2.charAt(i) , map2.getOrDefault(s2.charAt(i),0)+1);
            map2.put(s2.charAt(i-n) , map2.getOrDefault(s2.charAt(i-n),0)-1);
            if(map2.get(s2.charAt(i-n))== 0)
                map2.remove(s2.charAt(i-n));
            if(map.equals(map2)) return true ;   
        }
        return false ;
    }
}