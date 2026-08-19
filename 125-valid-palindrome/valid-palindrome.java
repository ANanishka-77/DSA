class Solution {
    public boolean isPalindrome(String s) {
        String cl=s.replaceAll("[^a-zA-Z0-9]","");
        String str=cl.toLowerCase();
        StringBuilder builder=new StringBuilder(str);
        builder.reverse();
        String reverse=builder.toString();
         return str.equals(reverse);
    }
}