class Solution {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int pro = 1;
        int num = n;

        while(num != 0) {
            int d = num % 10;
            sum = sum + d;
                        pro = pro * d;
            num = num / 10;
        }

       
        return pro - sum;
    }
}