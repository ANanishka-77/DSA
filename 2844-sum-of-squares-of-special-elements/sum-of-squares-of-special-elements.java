class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            //because in java indexing start from 0
            if(n%(i+1)==0)
            {
                
                sum=sum+(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}