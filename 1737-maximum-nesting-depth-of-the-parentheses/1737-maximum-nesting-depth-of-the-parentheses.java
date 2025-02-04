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
            if(!S.isFull())
            S.push(c);
            m=m+1;
        }
        else if(c=='}'||c==']'||c==')')
        {
            if(!S.isEmpty())
            {
            char d=S.pop();
            m=m-1;
            if(!((c=='}'&& d=='{')||(c==']' && d=='[')||(c==')'&& d=='(')))
            {
                return 0;
            }
            }
            else
            {
                return 0;
            }

        }
        if(m>max)
        {
            max=m;
        }
      }
      if(!S.isEmpty())
      {
        return 0;
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
    boolean isEmpty()
    {
       return top==-1;
    }
    boolean isFull()
    {
       return top==n-1;
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
