class Solution {
    public char findTheDifference(String s, String t) {
       char xor=0;
       for(char c:s.toCharArray())
         xor^=c;
       for(char d:t.toCharArray())
        xor^=d;
       return xor;
    }
}