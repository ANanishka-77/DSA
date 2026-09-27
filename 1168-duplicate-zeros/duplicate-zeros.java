class Solution {
    public void duplicateZeros(int[] arr) {

        int i = 0;
        int j = 0;

        int num[] = new int[arr.length];

        while(i < arr.length && j < num.length) {

            if(arr[i] != 0) {
                num[j] = arr[i];
                i++;
                j++;
            }
            else {
                num[j] = 0;

                if(j + 1 < num.length) {
                    num[j + 1] = 0;
                }

                i++;
                j += 2;
            }
        }

        for(int k = 0; k < arr.length; k++) {
            arr[k] = num[k];
        }
    }
}