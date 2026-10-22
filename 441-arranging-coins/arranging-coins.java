// class Solution {
//     public int arrangeCoins(int n) {
//        int i=1;
//        while(i<=n)
//        {
//         n=n-i;
//         i++;
//        }
//        return i-1;
//     }
// }

// class Solution {
//     public int arrangeCoins(int n) {
//         int max=0;
//         int c=0;
//         int i=1;
//         while(n>0 )
//         { 
//             if(i<=n){
//              c=n-i;
//             }

//             else if(c>max)
//             {
//                  max=c;
//             }
//             c=0;
//             n=n-i;
//             i++;
           
//         }
//         return max;
//     }
// }

class Solution {
    public int arrangeCoins(int n) {
        int max = 0;
        int c = 0;
        int i = 1;

        while (n > 0) {
            if (i <= n) {
                c = n - i;
                max++;
            } else {
                break;
            }

            n = c;
            c = 0;
            i++;
        }

        return max;
    }
}