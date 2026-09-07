class Solution {
    public void moveZeroes(int[] nums) {
        //  int count=0;
        //   for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[count] = nums[i];
        //         count++;
        //     }
        // }
        // for (int j = count; j < nums.length; j++) {
        //     nums[j] = 0;
        // }
        int i=0;
        int j=0;
        while(i<nums.length&&j<nums.length)
        {
            if(nums[j]==0)
            {
                j++;
            }
            else{
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
                
        }
    }
}