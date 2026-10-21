class Solution(object):
    def shortestToChar(self, s, c):
        """
        :type s: str
        :type c: str
        :rtype: List[int]
        """
        n = len(s)
        output = [n - 1] * n

        l = -(n + 1)
        for i, v in enumerate(s):
            if v == c: 
                l = i
            output[i] = i - l

        for i in reversed(range(n)):
            v = s[i]
            if v == c:
                l = i
            output[i] = min(abs(l - i),output[i])
        return output 

                
        