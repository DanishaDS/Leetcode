class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       int i,n=nums.length;
       for(i=0;i<n;i++)
       {
        if(h.contains(nums[i]))
        {
            return true;
        }
        h.add(nums[i]);
       }
        return false;
    }
}