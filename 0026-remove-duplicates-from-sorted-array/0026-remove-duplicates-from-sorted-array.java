class Solution {
    public int removeDuplicates(int[] nums) 
    {
        // edge case where array is of length 0
        if ( nums.length == 0 )
        {
            return 0;
        }
        // the final unique index 
        int i = 0; 
        // check each element if element at j is not same as element at i increment i
        // replace element at position i with element at position j
        // and repeat until j == end of array 
        for ( int j = 0; j < nums.length; j++ )
        {
            if ( nums[ j ] != nums[ i ] )
            {
                i++;
                nums[ i ] = nums[ j ];
            }
        }
        // number unique elements based on running of if statement 
        return i + 1;
    }
}