class Solution {
    public String countAndSay(int n) {
        if (n == 1) 
        return "1";
        String s = "1";
        for (int j = 0; j < n - 1; j++) {
            StringBuilder s1 = new StringBuilder();
            int n1 = s.length();
            for (int i = 0; i < n1; i++) {
                int count = 1;
                while (i < n1 - 1 && s.charAt(i) == s.charAt(i + 1)) 
                { 
                count++; 
                i++; 
                }
                s1.append(count).append(s.charAt(i));
            }
            s = s1.toString();
        }
        return s;
    }
}