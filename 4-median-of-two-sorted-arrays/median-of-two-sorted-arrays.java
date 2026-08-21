// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {

//         int n = nums1.length + nums2.length;

//         int[] nums3 = new int[n];

//         int k = 0;

    
//         for (int i = 0; i < nums1.length; i++) {
//             nums3[k] = nums1[i];
//             k++;
//         }

      
//         for (int i = 0; i < nums2.length; i++) {
//             nums3[k] = nums2[i];
//             k++;
//         }

       
//         Arrays.sort(nums3);

  
//         if (n % 2 != 0) {
//             return nums3[n / 2];
//         }

      
//         else {
//             int left = nums3[n / 2 - 1];
//             int right = nums3[n / 2];

//             return (left + right) / 2.0;
//         }
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums3= new int[n+m];
        for(int i=0;i<n;i++)
        {
            nums3[i]=nums1[i];
        }
         for(int i=0;i<m;i++)
      {
            nums3[n+i]=nums2[i];
        }
        Arrays.sort(nums3);
        int length = n + m;
        if(length % 2 == 1) 
        {
            return nums3[length / 2];
        }
        else 
        {
               return (nums3[length / 2 - 1] + nums3[length / 2])/2.0 ;
    }
}
}