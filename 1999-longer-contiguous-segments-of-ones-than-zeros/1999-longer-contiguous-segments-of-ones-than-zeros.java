class Solution {
    public boolean checkZeroOnes(String s) {
        int n=s.length(),i;
        int c=0,d=0,zero=0,one=0;
        
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
                zero=Math.max(zero,d);
                d=0;
            }
            else
            {
                d++;
                one=Math.max(one,c);
                c=0;
            }
        }
         zero=Math.max(zero,d);
         one=Math.max(one,c);
        if(one>zero)
        return true;
        return false;
    }
}