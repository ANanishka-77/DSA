class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while( i<(n+t))
        {
           int m=i,mul=1;
           while(m>0)
           {
            int r=m%10;
             mul=mul*r;
             m=m/10;
             
            }
             if(mul%t==0)
                return i;
             else
                  i++;
        }
        return -1;
    }
}