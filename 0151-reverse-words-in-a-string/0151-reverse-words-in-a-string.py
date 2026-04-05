class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        # used to split the characters into words 
        words = s.split()
        # where the reversed words would be stored in a list 
        rev = []

        for i in range(len(words) - 1, - 1, - 1):
            rev.append(words[i])
        answer = " ".join(rev)
        
        return answer 

        