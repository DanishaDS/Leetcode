class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int i,l,c=0;
        String s;
        for(i=0;i<n;i++)
        {
          s=Integer.toString(nums[i]);
          l=s.length();
          if(l%2==0)
          {
            c++;
          }
        }
        return c;
    }
}