class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n,e=0;
        n=s1.length();
        int i,j=0;
        char c,d,l,m;
        String s="";
        char arr[]=new char[2];
        int arr1[]=new int[2];
        if(s1.equals(s2))
        {
            return true;
        }
        for(i=0;i<n;i++)
        {
            c=s1.charAt(i);
            d=s2.charAt(i);
            if(c!=d)
            {
                if(j<2)
                {
                arr[j]=d;
                arr1[j]=i;
                j++;
                }
                else
                return false;
            }
        }
        for(i=0;i<n;i++)
        {
            
            if(i==arr1[0])
            {
               c=arr[1];
            }
            else if(i==arr1[1])
            {
               c=arr[0];
            }
            else
            {
                c=s2.charAt(i);
            }
            s=s+Character.toString(c);
        }
        return s1.equals(s);
    }
}