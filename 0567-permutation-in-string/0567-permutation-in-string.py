class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        m = len(s2)
        n = len(s1)
        if n == m :
            return Counter(s1)==Counter(s2)
        dic1 = Counter(s1)
        dic2 = Counter(s2[:n])
        for i in range (n,len(s2)):
            ch = s2[i]
            if sorted(dic1.items()) == sorted(dic2.items()) :
                return True
            else :
                dic2[s2[i-n]] = dic2.get(s2[i-n],0)-1
            if dic2[s2[i-n]]==0:
                del dic2[s2[i-n]]
            dic2[ch] = dic2.get(ch,0)+1
            if sorted(dic1.items()) == sorted(dic2.items()) :
                return True
            
        return False