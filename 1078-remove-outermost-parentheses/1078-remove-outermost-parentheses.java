class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder out = new StringBuilder();
        char[] a = s.toCharArray();
        int n = a.length;
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == '(') {
                c++;
                out.append('(');
            } else {
                if (c == 0) {
                    i++;
                } else {
                    out.append(')');
                    c--;
                }
            }
        }
        return out.toString();
    }
}


