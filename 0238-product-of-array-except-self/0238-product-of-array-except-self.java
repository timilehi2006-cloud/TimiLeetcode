class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] res = new int[n];

        // calculate lefts and store them in res from start 
        int left = 1; 
        for ( int i = 0; i < n; i++ )
        {
            res[i] = left;
            left *= nums[i];
        }
        // calculate rights and its products from the end 
        int right = 1;
        for ( int i = n - 1; i >= 0; i-- )
        {
            
           res[i] *= right;
           right *= nums[i]; 
        }
        return res;
    }
}