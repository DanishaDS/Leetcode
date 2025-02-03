class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> H=new HashSet<>();
        for(int num:nums)
        {
          if(H.contains(num))
          {
            return num;
          }  
          H.add(num);
        }
        return -1;
    }
}