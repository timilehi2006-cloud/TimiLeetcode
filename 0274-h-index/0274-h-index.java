class Solution 
{
    public int hIndex(int[] citations) 
    {
     // largest number in array you can find the largest number 
     // of times 
     
     Arrays.sort(citations);
     int n = citations.length;

     for ( int i = 0; i < n ; i++ )
     {
        if ( citations[i] >= n - i )
        {
            return n - i;
        }
     }
     return 0;
    }
}    