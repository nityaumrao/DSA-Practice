class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap <Character,Integer> map = new HashMap<>();
        int l = 0 ;
        int maxLength = 0;
        for(int r = 0 ; r<n ; r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.get(s.charAt(r))>1){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            maxLength = Math.max(maxLength,r-l+1);
        }
        return maxLength ;
    }
}