class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int i,sum=0;
        char c=s.charAt(0);
        for(i=0;i<n;i++)
        {
            char d=s.charAt(i);
            sum=sum+Math.abs((int)c-(int)d);
            c=d;
        }
        return sum;
    }
}