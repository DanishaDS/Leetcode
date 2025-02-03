class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int i,j=0,sum=0;
        for(i=0;i<n;i++)
        {
                if(i==j)
                {
                    sum=sum+mat[i][j];
                }
                j++;
            
        }
        j--;
        for(i=0;i<n;i++)
        {
            sum=sum+mat[i][j];
            j--;
        }
        if(n%2!=0)
        {
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
}