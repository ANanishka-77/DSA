class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();

        int i = 0;
        int j = 0;

       
            while (i < s.length()) {
                if (s.charAt(i) == '#') {
                    if (st1.length() > 0) {
                        st1.deleteCharAt(st1.length() - 1);
                    }
                    
                } else {
                    st1.append(s.charAt(i));
                }
                i++;
            }

        while (j < t.length()) {
            if (t.charAt(j) == '#') {
                if (st2.length() > 0) {
                    st2.deleteCharAt(st2.length() - 1);
                }
            } else {
                st2.append(t.charAt(j));
            }
            j++;
        }

        return st1.toString().equals(st2.toString());
    }
}