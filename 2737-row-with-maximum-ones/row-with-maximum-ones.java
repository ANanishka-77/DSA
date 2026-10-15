class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       
         int maxcount=Integer.MIN_VALUE;
         int arr[]=new int[2];
              for(int i=0;i<mat.length;i++)
     {
        int count=0;
        for(int j=0;j<mat[0].length;j++)
        {
            if(mat[i][j]==1)
            {
                count++;
            }
        }
        if(count>maxcount)
        {
        maxcount=count;
        

        arr[0]=i;
        arr[1]=maxcount;
        }

     }   
     return arr;
    }
}
