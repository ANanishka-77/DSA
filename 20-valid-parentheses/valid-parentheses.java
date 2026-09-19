class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            // Opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            }

            // Closing bracket but stack is empty
            else if (top == -1) {
                return false;
            }

            // Wrong matching
            else if (ch == ')' && stack[top] != '(') {
                return false;
            }

            else if (ch == '}' && stack[top] != '{') {
                return false;
            }

            else if (ch == ']' && stack[top] != '[') {
                return false;
            }

            // Correct matching → pop
            else {
                top--;
            }
        }

        // Stack must be empty
        return top == -1;
    }
}