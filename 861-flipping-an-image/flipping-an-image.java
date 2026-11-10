class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int arr[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            int first=0;
            int last=image[0].length-1;
            while(first<last)
            {
               int temp=image[i][first];
               image[i][first]=image[i][last];
               image[i][last]=temp;
               first++;
               last--;
            }
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==0)
                {
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
return arr;
    }
}