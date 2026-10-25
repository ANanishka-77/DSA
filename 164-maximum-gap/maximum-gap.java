class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
int max=0;
        for(int i=0;i<nums.length-1;i++){
           int j=i+1;
           if(nums[j]-nums[i]>max)
           {
            max=nums[j]-nums[i];
           }
        }
        return max;
    
    }
}