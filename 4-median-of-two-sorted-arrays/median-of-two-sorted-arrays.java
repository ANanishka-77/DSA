class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;

        int[] nums3 = new int[n];

        int k = 0;

    
        for (int i = 0; i < nums1.length; i++) {
            nums3[k] = nums1[i];
            k++;
        }

      
        for (int i = 0; i < nums2.length; i++) {
            nums3[k] = nums2[i];
            k++;
        }

       
        Arrays.sort(nums3);

  
        if (n % 2 != 0) {
            return nums3[n / 2];
        }

      
        else {
            int left = nums3[n / 2 - 1];
            int right = nums3[n / 2];

            return (left + right) / 2.0;
        }
    }
}