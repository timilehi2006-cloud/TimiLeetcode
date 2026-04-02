class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        // create new array of size nums.length 
        int [] sigArray = new int [ nums.length ];
        
        // find the square of each element and insert into new array 
        for ( int i = 0; i < nums.length; i++ )
        {
            sigArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sigArray);
        return sigArray;
    }
}