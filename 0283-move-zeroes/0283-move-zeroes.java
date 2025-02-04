class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        int n=nums.length;
        int m=n,c=1;
        for(i=0;i<m-1;i++)
        {
            if(nums[i]==0)
            {
                for(j=i;j<m-1;j++)
                {
                    nums[j]=nums[j+1];
                    
                }
                nums[n-c]=0;
                c++;
                m=m-1;
                i=i-1;
            }
        }
    }
}