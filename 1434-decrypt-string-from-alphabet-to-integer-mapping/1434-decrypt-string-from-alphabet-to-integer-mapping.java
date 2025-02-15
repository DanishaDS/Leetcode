class Solution {
    public String freqAlphabets(String s) {
        String s1="abcdefghijklmnopqrstuvwxyz",s2="";
        int i,n=s.length();
        for(i=0;i<n-2;i++)
        {
            char c=s.charAt(i);
            char d=s.charAt(i+2);
            if(d=='#')
            {
                char e=s.charAt(i+1);
                s2=s2+s1.charAt(((Character.getNumericValue(c)*10)+Character.getNumericValue(e))-1);
                i=i+2;
            }
            else
            s2=s2+s1.charAt((Character.getNumericValue(c))-1);
        }
        if(i!=n)
        {
            char c=s.charAt(i);
            s2=s2+s1.charAt((Character.getNumericValue(c))-1);
            i++;
            if(i!=n)
            {
             char d=s.charAt(i);
            s2=s2+s1.charAt((Character.getNumericValue(d))-1);
            }

        }
        return s2;
    }
}