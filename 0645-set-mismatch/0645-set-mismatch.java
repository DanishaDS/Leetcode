class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> H= new HashSet<>();
        int s[]=new int[2];
        int n=nums.length,sum,su=0;
        for(int num:nums)
        {
            if(H.contains(num))
            {
                s[0]=num;
            }
            H.add(num);
            su=su+num;
        }
        sum=(n*(n+1))/2;
        s[1]=sum-su+s[0];
        return s;
    }
}