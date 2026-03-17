class Solution 
{

    public int removeDuplicates(int[] nums) 
    {
        //edge case 
        if ( nums.length <= 2 )
        {
            return nums.length;
        }

        // check if there are more than 2 consecutive of the same element 
        // and swap the third if it exists 

        int i = 2;// next write position 
        for ( int j = 2; j < nums.length; j++ )
        {
            if ( nums[ j ] != nums[ i - 2 ] )
            {
                nums[ i ] = nums[ j ];
                i++;
            }
        }  
        return i;
    }
}