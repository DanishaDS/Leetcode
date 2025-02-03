class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet <Integer> H=new HashSet <>();
        List <Integer> H1=new ArrayList <>();
        int n=nums.length;
        int i,k=0;
        int arr[]=new int[2];
        for(i=0;i<n;i++)
        {
            if(H.contains(nums[i]))
            {
                H1.add(nums[i]);
            }
            H.add(nums[i]);
        }
        return H1;
    }
}
    