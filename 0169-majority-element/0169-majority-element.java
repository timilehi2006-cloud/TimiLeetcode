class Solution {
    public int majorityElement(int[] nums) 
    {
        int current = 0;
        int count = 0;

        for ( int x : nums )
        {
            // use count to check each element against current 
            // then return the current occuring largest 
            if ( count == 0 )
            {
                current = x;
            }

            if ( x == current )
            {
                count++;
            }
            else 
            {
                count--;
            }
        }
        return current;
    }
}