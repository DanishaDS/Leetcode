class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        return max;
    }
}