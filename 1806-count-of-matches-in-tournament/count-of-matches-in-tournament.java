// class Solution {
//     public int numberOfMatches(int n) {
//         int sum=0;
//         while(n>0)
//         {
       
//             if(n%2==0)
//             {
//                 n=n/2;
//                 sum=sum+n;
//             }
//             else{
//                n=(n-1)/2;
//                 sum=sum+n;
//                 n=n+1;
//             }

//         }
//         return sum;
//     //   return n-1;  
//     }
// }

class Solution {
    public int numberOfMatches(int n) {
        int sum=0,r;
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
                sum=sum+n;
            }
            else{
                 n=(n-1)/2;
                sum=sum+n+1;
              
            }
        }
        return sum;
    }
}