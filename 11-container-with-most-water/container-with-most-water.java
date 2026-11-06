class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j)
        {
            int length=j-i;
            if(height[i]<height[j])
            {
                  max=Math.max(max,length*height[i]);
                  i++;
            }
            else{
                max=Math.max(max,length*height[j]);
                j--;
            }
          
            
        }
        return max;
    }
}