class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int n=nums.length;
       int prefixMax[]=new int[n];
       int suffixMin[]=new int[n];

       prefixMax[0]=nums[0];
       for(int i=1;i<n;i++)
       {
         prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
       }

       suffixMin[n-1]=nums[n-1];
       for(int i=n-2;i>=0;i--)
       {
         suffixMin[i]=Math.min(nums[i],suffixMin[i+1]);
       }
         int i=0;
         int j=0;
         while(i<prefixMax.length&&j<suffixMin.length)
         {
            int sum=prefixMax[i]-suffixMin[j];
            if(sum<=k)
            {
                return i;
            }
            i++;
            j++;
         }
         return -1;
    }
}