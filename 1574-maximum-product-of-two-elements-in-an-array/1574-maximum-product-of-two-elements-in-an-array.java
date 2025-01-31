class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],s=0;
        int i,n=nums.length;
        for(i=1;i<n;i++)
        {
            if(nums[i]>max)
            {
                s=max;
                max=nums[i];
            }
            else if(nums[i]>s)
            {
               s=nums[i];
            }
        }
        return (max-1)*(s-1);
    }
}