class Solution {
    public int kthFactor(int n, int k) 
    {
        // for keeping track till position k 
       int count = 0;

       for ( int i = 1; i <=  n; i++ )
       {
            // checks if its a factor 
            if ( n % i == 0 )
            {
                count++;
            }
            // checks if it is the factor at the kth position
            if ( count == k )
            {
                return i;
            }
       }
       return -1;
    }
}