class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int r=matrix.length;
     int c=matrix[0].length;
     int count=0,i,j;
     for(i=0;i<r;i++)
     {
            if(target>=matrix[i][0] && target<=matrix[i][c-1])
            {
              for(j=0;j<c;j++)
              {
                if(matrix[i][j]==target)
                {
                    count++;
                }
              }
            }
        
     }
     if(count==0)
     return false;
     return true;
     
    }
}