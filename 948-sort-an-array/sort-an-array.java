class Solution {
    public int[] sortArray(int[] nums) {
        
        mergesort(nums,0,nums.length-1);
        return nums;

    }
    public void mergesort(int nums[],int s,int e)
    {
       if(s>=e)
       return;

       int mid=(s+e)/2;

       mergesort(nums,s,mid);
       mergesort(nums,mid+1,e);
       merge(nums,s,mid,e);
    }
    public void merge(int nums[],int s,int mid,int e){
        int leftArrlen=mid-s+1;
        int rightArrlen=e-mid;

        int left[]=new int[leftArrlen];
        int right[]=new int[rightArrlen];

        int k=s;
         for(int i=0;i<leftArrlen;i++)
         {
            left[i]=nums[k];
            k++;
         }
         k=mid+1;
         for(int j=0;j<rightArrlen;j++)
         {
            right[j]=nums[k];
            k++;
         }

         int i=0;
        int j=0;
         k=s;
        while(i<leftArrlen&&j<rightArrlen)
        {
            if(left[i]<right[j])
            {
                nums[k]=left[i];
                i++;
                k++;
            }
            else{
                 nums[k]=right[j];
                j++;
                k++;

            }
        }
        while(i<leftArrlen)
        {
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<rightArrlen)
        {
            nums[k]=right[j];
            j++;
            k++;
        }
    }
}