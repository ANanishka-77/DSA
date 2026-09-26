class Solution {
    public int pivotInteger(int n) {
        int tSum=0;
       int lSum=0;
        for(int i=1;i<=n;i++)
        {
            tSum=tSum+i;
        }
        for(int i=1;i<=n;i++)
        {
           int rSum=tSum-lSum-i;

           if(lSum==rSum)
           {
            return i;
           }
           else{
                      lSum=lSum+i;
           }
        }
        return -1;


    }
}