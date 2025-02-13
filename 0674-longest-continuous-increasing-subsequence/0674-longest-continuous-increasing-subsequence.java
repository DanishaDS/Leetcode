class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int i,j=0,s=0,e=0,max=0;
        for(i=0;i<n-1;i++)
        {
           if(nums[i]<nums[i+1])
           {
            e++;
           } 
           else
           {
            max=Math.max(max,((e-s)+1));
            s=i;
            e=i;
            
           }
        }
        max=Math.max(max,((e-s)+1));
        return max;
    }
}