class Solution {
    public boolean halvesAreAlike(String s) {
       
        int c1=0;
        int c2=0;
      
            int mid=s.length()/2;
            for(int i=0;i<mid;i++)
            {
                if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    c1++;
                }
            }

            for(int k=mid;k<s.length();k++)
            {
                if(s.charAt(k)=='A'||s.charAt(k)=='E'||s.charAt(k)=='I'||s.charAt(k)=='O'||s.charAt(k)=='U'||s.charAt(k)=='a'||s.charAt(k)=='e'||s.charAt(k)=='i'||s.charAt(k)=='o'||s.charAt(k)=='u')
                {
                    c2++;
                }
            }


        
         if(c1==c2)
         {
            return true;
         }
         return false;
    }
}