class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int combinedLength = nums1.length + nums2.length;
        int[] combinedArray = new int[combinedLength];
        
        // loop through arrays and put into combined array 
        for ( int i = 0; i < nums1.length; i++ )
        {
            combinedArray[i] = nums1[i];
        }
        for ( int j = 0 ; j < nums2.length; j++ )
        {
            combinedArray[nums1.length + j] = nums2[j];
        }

        // sort the combined array 
        Arrays.sort(combinedArray);
        int size =  combinedLength; 

        // find the midpoint if odd 
        if ( size % 2 == 1 )
        {
            return  combinedArray[ size / 2 ];
        }
        // if midpoint is even 
        else 
        {
            return (combinedArray[ size / 2 ] + combinedArray[ (size / 2) - 1 ]) / 2.0;
        }
    }
}