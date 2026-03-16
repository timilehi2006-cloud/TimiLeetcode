class Solution {
    public int jump(int[] nums) 
    {
      int jumps = 0;// amount of jumps 
      int end = 0;// end of jumps 
      int farthest = 0;// farthest possible 

      for ( int i = 0; i < nums.length - 1; i++ )
      {
        // calculates the next farthest distance to jump 
        farthest = Math.max(farthest, i + nums[i]);
        {
            //changes the end as farthest changes based on position i 
            if ( i == end )
            {
                jumps++;
                end = farthest;
            }
        }
      }
      return jumps;
    }
}