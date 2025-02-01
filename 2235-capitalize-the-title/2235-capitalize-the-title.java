class Solution {
    public String capitalizeTitle(String title) {
        int l=title.length(),i,n;
        String s1="",s2="";
        title= title.toLowerCase();
       String s[]=title.split(" ");
       int m=s.length;
       for(i=0;i<m;i++)
       {
         n=s[i].length();
         if(n<=2)
         {
            s1=s1+s[i]+" ";
         }
         else
         {
            s2=Character.toString(s[i].charAt(0)).toUpperCase();
            s1=s1+s2+s[i].substring(1,n)+" ";
         }
       }
       return s1.substring(0,s1.length()-1);
    }
}

 