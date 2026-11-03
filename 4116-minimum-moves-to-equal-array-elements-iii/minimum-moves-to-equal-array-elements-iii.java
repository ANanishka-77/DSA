class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int n:nums)
        {
            max=Math.max(n,max);
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=max)
            {
                nums[i]=nums[i]+1;
                count++;
            }
        }
        return count;
    }
}