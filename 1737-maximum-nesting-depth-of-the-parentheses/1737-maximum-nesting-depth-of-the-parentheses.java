class Solution {
    public int maxDepth(String s) {
      int n=s.length();
      Stack1 S=new Stack1(n);
      int i,max=0,m=0;
      for(i=0;i<n;i++)
      {
        char c=s.charAt(i);
        if(c=='{'||c=='['||c=='(')
        {
            
            S.push(c);
            m=m+1;
        }
        else if(c=='}'||c==']'||c==')')
        {
        
            char d=S.pop();
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
class Stack1
{
    int top;
    int n;
    char arr[];
    Stack1(int n)
    {
        this.n =n;
        arr=new char[n];
        top=-1;
    }
    void push(char c)
    {
        arr[++top]=c;
    }
    char pop()
    {
        return arr[top--];
    }
}
