class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet <Integer> H=new HashSet <>();
        int n=nums.length;
        int i,k=0;
        int arr[]=new int[2];
        for(i=0;i<n;i++)
        {
            if(H.contains(nums[i]))
            {
                arr[k]=nums[i];
                k++;
            }
            H.add(nums[i]);
        }
        return arr;
    }
}