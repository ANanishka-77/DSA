// class Solution {
//     public int lengthOfLastWord(String s) {

//         char[] chars = s.toCharArray();
//         int count = 0;
//         int i = chars.length - 1;

// while (i >= 0 && chars[i] == ' ') {
//             i--;
//         }        

//         while (i >= 0 && chars[i] != ' ') {
//             count++;
//             i--;
//         }

//         return count;
//     }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        char[] Array = s.toCharArray();
        int n = Array.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (Array[i] == ' ') {

                if (count > 0) {
                    int j = i + 1;
                    while (j < Array.length && Array[j] == ' ') {
                        j++;
                    }
                
                if (j < Array.length) {
                    count = 0;
                }
                }
            } else {
                count++;

            }

        }
        return count;
    }
}
