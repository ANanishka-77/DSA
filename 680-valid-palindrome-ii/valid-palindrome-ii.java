class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                int l=i+1;
                int r=j;

                while(l<r)
                {
                    if(s.charAt(l)!=s.charAt(r))
                    {
                        break;
                    }
                    l++;
                    r--;
                }

               if(l>=r)
               return true;

                l=i;
                r=j-1;
                while(l<r)
                {
                    if(s.charAt(l)!=s.charAt(r))
                    {
                        return false;
                    }
                   l++;
                   r--;
                }
                return true;
            }
            i++;
            j--;
        }
        return true;
    }
}