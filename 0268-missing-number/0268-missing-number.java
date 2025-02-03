class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,i,s=0;
        
        for(i=1;i<=n;i++)
        {
            s=s^i;
        }
        for(i=0;i<n;i++)
        {
            s=s^nums[i];
        }
        return s;
    }
}