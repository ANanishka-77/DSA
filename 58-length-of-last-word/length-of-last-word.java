class Solution {
    public int lengthOfLastWord(String s) {

        char[] chars = s.toCharArray();
        int count = 0;
        int i = chars.length - 1;

      
        while (i >= 0 && chars[i] == ' ') {
            i--;
        }

      
        while (i >= 0 && chars[i] != ' ') {
            count++;
            i--;
        }

        return count;
    }
}