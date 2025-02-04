class Solution {
    public boolean isValid(String s) {
      int n=s.length();
      Stack1 S=new Stack1(n);
      int i;
      for(i=0;i<n;i++)
      {
        
        char c=s.charAt(i);
        if(c=='{'||c=='['||c=='(')
        {
            if(!S.isFull())
            S.push(c);
        }
        else if(c=='}'||c==']'||c==')')
        {
            if(!S.isEmpty())
            {
            char d=S.pop();
            if(!((c=='}'&& d=='{')||(c==']' && d=='[')||(c==')'&& d=='(')))
            {
                return false;
            }
            }
            else
            {
                return false;
            }

        }
      }
      if(!S.isEmpty())
      {
        return false;
      }
     
      return true;
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