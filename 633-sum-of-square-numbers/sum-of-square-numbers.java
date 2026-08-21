class Solution {
    public boolean judgeSquareSum(int c) {
        double sq=Math.sqrt(c);
      
        int y = (int)sq;
          if(sq==y)
        return true;
        double nums[]=new double[y+1];
       for(int i=0;i<nums.length;i++)
       {
        nums[i]=i;
       }
       int i=1;
       int j=nums.length-1;
       double sum=0;
       while(i<=j)
       {
        sum=nums[i]*nums[i]+nums[j]*nums[j];
        if(sum==c)
        return true;
        else if(sum<c)
        {
        i++;
        }
        else 
        {
            j--;
        }
       }
 return false;
    }
}