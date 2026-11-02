class Solution {
    public int missingNumber(int[] nums) {
    //     int count = 0;
    //     int isum=0;
    //     for (int i = 0; i < nums.length; i++) {
    //           count++;
    //     }
    //    int n=count;
    //    int sum=(n*(n+1))/2;
    //   for(int i=0;i<nums.length;i++)
    //   {
    //     isum=isum+nums[i];
    //   }
    //   int totalsum=sum-isum;
    //     return totalsum;
    // }

    int xorSum=0;
    for(int n:nums)
    {
        xorSum=xorSum^n;
    }
    for(int i=0;i<=nums.length;i++)
    {
        xorSum=xorSum^i;
    }
    return xorSum;
    }
  
}