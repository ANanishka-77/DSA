// class Solution {
//     public String interpret(String command) {
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < command.length(); i++) {
//             if (command.charAt(i) == 'G') {
//                 result.append('G');
//             } 
//             else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
//                 result.append('o');
//                 i++;
//             } 
//             else if (command.charAt(i) == '(') {
//                 result.append("al");
//                 i += 3;
//             }
//         }

//       return result.toString();
// }
// }


class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
         char[] arr = command.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='G')
                 s.append("G");
            else if(arr[i]=='(' && arr[i+1]==')')
                 s.append("o");
            else if(arr[i]=='(' && arr[i+3]==')')
                s.append("al");
        }
        return s.toString();
    }
}