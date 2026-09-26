class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum2=0;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        sumLeft[0]=nums[0];

        for (int i = 1; i < n; i++) {
            sum = nums[i] + sumLeft[i-1];
            sumLeft[i] = sum;
        }
       

        sumRight[n-1]=nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            sum2 = nums[i] + sumRight[i+1];
            sumRight[i] = sum2;
        }
        int i = 0;
        int j = 0;
        while (i < sumLeft.length && j < sumRight.length) {

            if (sumLeft[i] == sumRight[j]) {
                return i;
            } else {
                i++;
                j++;
            }

        }
        return -1;
    }
}