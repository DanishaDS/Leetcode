class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length,i;
        char ch='z';
        int c=0;
        for(i=0;i<n;i++)
        {
            if(letters[i]>target && letters[i]<=ch)
            {
                ch=letters[i];
                c=1;
            }
        }
        if(c==0)
        return letters[0];
        return ch;
    }
}