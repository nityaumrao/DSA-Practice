class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0 ; 
        for(int i = 0 ; i<s.length() ; i++){
            HashMap <Character,Integer> map = new HashMap<>();
            for(int j = i ; j<s.length() ; j++){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j),0)+1);
                if(map.get(s.charAt(j))>1){
                    break;
                }
                count = Math.max(count,j-i+1);
            }
        }
        return count ;
    }
}