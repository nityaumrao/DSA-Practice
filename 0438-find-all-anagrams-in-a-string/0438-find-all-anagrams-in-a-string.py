class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        dic = {}
        result = []
        n = len(s)
        m = len(p)
        if n<m :
            return []
        temp = {}
        for i in range(m) :
            dic[p[i]] = dic.get(p[i],0)+1
            temp[s[i]] = temp.get(s[i],0)+1

        if dic == temp :
            result.append(0)

        for i in range(m,n) :
            old = s[i-m]
            temp[old] -= 1
            temp[s[i]] = temp.get(s[i],0)+1

            if temp[old]==0:
                del temp[old]
            
            if dic == temp :
                result.append(i-m+1)

        return result