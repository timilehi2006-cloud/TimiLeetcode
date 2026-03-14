class Solution {
    public int reverse(int x) 
    {
        // the loop case to reverse 
        int rev = 0;

        while ( x != 0 )
        {
            // the reversed digit 
            int digit = x % 10;
            
            // check edge case of [ -2^31 , 2^31 - 1 ]
            if ( rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10 )
            {
              return 0;
            }

              // get the reversed digit,assign to rev and remove last digit 
               rev = (rev * 10) + digit;
               x = x / 10; 
        }
        return rev;
    }
}