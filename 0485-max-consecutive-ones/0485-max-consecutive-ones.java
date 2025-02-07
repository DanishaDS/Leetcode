class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int n=nums.length,i;
        int c=0,one=0;
        
        for(i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                one=Math.max(one,c);
                c=0;
            }
        }
         
         one=Math.max(one,c);
         
        return one;
    
    }
}