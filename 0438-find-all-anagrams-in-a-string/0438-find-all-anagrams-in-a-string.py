class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        result = []
        m = len(p)

        need = Counter(p)
        window = Counter(s[:m])

        if window == need:
            result.append(0)

        for i in range(m, len(s)):
            window[s[i]] += 1
            window[s[i-m]] -= 1

            if window[s[i-m]] == 0:
                del window[s[i-m]]

            if window == need:
                result.append(i - m + 1)

        return result