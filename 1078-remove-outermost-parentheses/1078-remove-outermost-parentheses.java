class Solution {
public  String removeOuterParentheses(String s) {
        String out="";
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c == '(')
             {
                if (top > 0) {
                    out =out+c;
                }
                top++;
            } else {
                top--;
                if (top > 0) {
                    out =out+c;
                }
            }
        }

        return out;
    }
}

