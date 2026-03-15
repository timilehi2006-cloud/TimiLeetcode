class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        // merge the elements in nums2 into the space within nums1 
        for ( int i = 0 ; i < n; i++ )
        {
            nums1[ m + i ] = nums2[ i ];
        }

        // using a sorting Algorithm ( insertion sort )
        for ( int sort = 1; sort < m + n; sort++ )
        {
           int indi = nums1[ sort ];
           int j = sort - 1;

           while ( j >= 0 && nums1[ j  ] > indi )
           {
                nums1[ j + 1 ] = nums1[ j ];
                j--;
           }
           nums1[ j + 1 ] = indi;
        }
    }
}