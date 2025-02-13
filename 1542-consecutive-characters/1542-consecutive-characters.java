class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int i,m=0,max=0;
        char c,d;
        for(i=0;i<n-1;i++)
        {
            c=s.charAt(i);
            d=s.charAt(i+1);
            if(c==d)
            {
                m++;
            }
            else
            {
            max=Math.max((m+1),max);
            m=0;
            }
        }
         max=Math.max((m+1),max);
        return max;
    }
}