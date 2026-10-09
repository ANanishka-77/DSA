class Solution {
    public String makeGood(String s) {
        //difference between small case and uppercase is 32
        //ASCII of A is 65
        //ASCII of a is 97
        //difference between them is 32

        StringBuilder res=new StringBuilder();
        
        char str[]=s.toCharArray();
        for(int i=0;i<str.length;i++)

        {
            if(res.length()>0)
            {
               char last=res.charAt(res.length()-1);
               if(last+32==str[i]||last-32==str[i])
               {
                res.deleteCharAt(res.length()-1);
                continue;
               }
            }
            res.append(str[i]);
        }
        return res.toString();
    }
}