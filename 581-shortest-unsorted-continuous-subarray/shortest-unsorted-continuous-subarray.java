class Solution {
    public int findUnsortedSubarray(int[] nums) {
           int arr[]=nums.clone();

           Arrays.sort(arr);

           int left=0;
           int right=nums.length-1;

           while(left<nums.length&&nums[left]==arr[left])
           {
            left++;
           }
           while(right>=0&&nums[right]==arr[right])
           {
            right--;
           }
           if(left>=right)
           {
            return 0;
           }
           return right-left+1;
    }
}