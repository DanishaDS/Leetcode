class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length,max=1,i,j;
        int arr[]=new int [n];
        Arrays.fill(arr,1);
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
           if(nums[i]>nums[j])
           {
             arr[i]=Math.max(arr[i],(arr[j]+1));
           }
            }
        }
        for(i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}