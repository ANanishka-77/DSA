class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num<=9)
        {
            return num;
        }
        while(num>9)
        {
            int d=num%10;
            int e=num/10;
            sum=d+e;
            num=sum;
        }
        return sum;
    }
}