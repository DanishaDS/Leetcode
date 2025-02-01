class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length,i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<m-1;j++)
            {
                if(matrix[i][j]==matrix[i+1][j+1])
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}