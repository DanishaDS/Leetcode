class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,i;
        int ans[]=new int[2*n];
        for(i=0;i<n;i++)
        {
            ans[i]=nums[i];
        }
        for(i=0;i<n;i++)
        {
            ans[i+n]=nums[i];
        }
        return ans;
    }
}