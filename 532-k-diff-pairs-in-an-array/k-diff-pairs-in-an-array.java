class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int count=0;
        int n=nums.length;
        while(i<n&&j<n)
        {
            if(i==j||nums[j]-nums[i]<k)
            {
               j++;
            }
            else if(nums[j]-nums[i]>k)
            {
                i++;
            }
            else{
                count++;
                i++;
                while(i<n&&nums[i]==nums[i-1])
                {
                    i++;
                }
            }
        
        }
            return count;
    }
}