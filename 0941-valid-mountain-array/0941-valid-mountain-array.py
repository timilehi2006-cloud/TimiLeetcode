class Solution(object):
    def validMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        #edge case check 
        n = len(arr)
        if n < 3:
            return False
        
        left = 0
        right = n - 1 
        
        #move left up 
        while left + 1 < n and arr[left] < arr[left + 1]:
            left += 1
        
        #move right down 
        while right - 1 >= 0 and arr[right] < arr[right - 1]:
            right -= 1 
        
        #meeting at peak 
        return left == right and left != 0 and right != n - 1 
            
        
            
                
        