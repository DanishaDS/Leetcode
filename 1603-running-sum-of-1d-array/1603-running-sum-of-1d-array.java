class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,i;
        for(i=0;i<nums.length;i++)
        {
            int n=nums[i];
            nums[i]=nums[i]+sum;
            sum=sum+n;
        }
        return nums;
    }
}