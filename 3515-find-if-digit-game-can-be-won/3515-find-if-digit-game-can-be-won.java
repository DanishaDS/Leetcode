class Solution {
    public boolean canAliceWin(int[] nums) {
       int i,n=nums.length,s=0,m=0;
       for(i=0;i<n;i++)
       {
        if(nums[i]<10)
        s=s+nums[i];
        if(nums[i]>9)
        m=m+nums[i];
       } 
       return s!=m;
    }
}