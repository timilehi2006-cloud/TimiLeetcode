class Solution {
    public int removeElement(int[] nums, int val) 
    {
        // find the difference between the elements eual to k and the length 
        // this will be the size i.e the output 
        int counter = 0;
        for ( int i = 0; i < nums.length; i++ )
        {
            if ( nums[ i ] == val )
            {
                counter++;
            }
        }
        int size = nums.length - counter;

        // move the elements that are not equal to val to the back disregarding 
        // the ones that are equal to val 
        int index = 0;
        for ( int i = 0; i < nums.length; i++ )
        {
            if ( nums[ i ] != val )
            {
                nums[ index ] = nums[ i ];
                index++;
            }
        }
        return size;
    }
}