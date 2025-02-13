class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length,l,i,j;
        int arr[]=new int[c];
        String s="";
        for(i=0;i<c;i++)
        {
            arr[i]=0;
        for(j=0;j<r;j++)
        {
        s=Integer.toString(grid[j][i]);
        l=s.length();
        if(l>arr[i])
        {
          arr[i]=l;
        }

        }
        }
      return arr;
    }
}