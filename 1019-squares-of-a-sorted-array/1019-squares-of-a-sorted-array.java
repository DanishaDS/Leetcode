class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      int i,j,temp=0;
      for(i=0;i<n;i++)
      {
        nums[i]=nums[i]*nums[i];
      }  
      for(i=0;i<n-1;i++)
      {
        for(j=0;j<n-i-1;j++)
        {
            if(nums[j]>nums[j+1])
            {
            temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
            }
        }
      }
      return nums;
    }
}