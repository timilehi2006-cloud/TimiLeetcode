class Solution {
    public void duplicateZeros(int[] arr) 
    {
        for ( int i = 0 ; i < arr.length; i++ )
        {
            if ( arr[i] == 0 )
            {
                // shift everything right starting from the end 
                for ( int j = arr.length - 1 ; j > i; j-- )
                {
                    arr[j] = arr[ j - 1 ];
                }
                
                // insert 0 into the free position 
                if ( i + 1 < arr.length )
                {
                    arr[i+1] = 0;
                }
                // skip the 0 inserted so as to not overwrite it
                i++;
            }
        }
    }
}