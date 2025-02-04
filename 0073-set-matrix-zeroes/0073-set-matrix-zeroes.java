class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix[0].length;
        int c=matrix.length;
        int i,j;
        int arr[][]=new int [c][r];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                    arr[i][j]=matrix[i][j];
                
            }
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                if(arr[i][j]==0)
                {
                    zero(c,r,i,j,matrix);
                }
            }
        }
    }
    public int[][] zero(int n,int m,int o,int p,int[][]matrix)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            matrix[i][p]=0;
        }
        for(j=0;j<m;j++)
        {
            matrix[o][j]=0;
        }
        return matrix;
    }
}