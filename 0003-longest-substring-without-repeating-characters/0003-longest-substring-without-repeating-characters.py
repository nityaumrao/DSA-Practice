class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxi = 0
        dic={}
        i,j = 0,0
        while j<len(s) :
            ch = s[j]
            dic[ch]=dic.get(ch,0)+1

            while dic[ch]>1:
                dic[s[i]] = dic.get(s[i])-1
                i += 1
            maxi = max(maxi,j-i+1)
            j += 1
             
        return  maxi        