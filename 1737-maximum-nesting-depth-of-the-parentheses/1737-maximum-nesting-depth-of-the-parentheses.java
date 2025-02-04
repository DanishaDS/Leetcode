class Solution {
    public int maxDepth(String s) {
      int n=s.length();
      int i,max=0,m=0;
      for(i=0;i<n;i++)
      {
        char c=s.charAt(i);
        if(c=='(')
        {
            m=m+1;
        }
        else if(c==')')
        {
            m=m-1;
        }
        if(m>max)
        {
            max=m;
        }
      }
     
      return max;
    }
}
