class Solution {
    public String reverseWords(String s) {
        String s1[]=s.trim().split("\\s+");
        int l=s1.length;
        String s2="";
        int i;
        for(i=l-1;i>=0;i--)
        {
           s2=s2+s1[i];
           if(i>0)
           {
            s2=s2+" ";
           }
           
        }
        return s2;
    }
}

