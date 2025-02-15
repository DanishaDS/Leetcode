class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int f=nums[0];
        int l=nums[n-1];
        return GCD(f,l);
    }
    public int GCD(int f,int l)
    {
        if(l%f==0)
        {
            return f;
        }
        else
        {
            if(l>f)
            return GCD(l-f,f);
            else
            return GCD(f-l,l);
        }
        
    }
}