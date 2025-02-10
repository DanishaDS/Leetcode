class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int f=0,l=n-1,mid;
        while(f<=l)
        {
            mid=(f+l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                l=mid-1;
            }   
            else
            {
                f=mid+1;
            } 
            
         }
         return -1;
    }
}