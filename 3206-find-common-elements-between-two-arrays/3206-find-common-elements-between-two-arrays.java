class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int m=nums2.length;
        int i,j=0,k=0;
        Set<Integer> s =new HashSet<>();
        for(i=0;i<l;i++)
        {
            s.add(nums1[i]);
        }
        for(i=0;i<m;i++)
        {
            if(s.contains(nums2[i]))
            {
            j++;
            }

        }
        s.clear();
         for(i=0;i<m;i++)
        {
            s.add(nums2[i]);
        }
        for(i=0;i<l;i++)
        {
            if(s.contains(nums1[i]))
            {
            k++;
            }

        }
       int arr[]={k,j};
        return arr;
    }
}