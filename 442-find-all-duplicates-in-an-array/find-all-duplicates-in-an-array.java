class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> n=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(n.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
            else{
                n.add(nums[i]);
            }
        }
        return arr;
    }
}