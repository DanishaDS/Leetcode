class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,k=0,j=0,a;
        int arr[]=new int[m+n];
        for(i=0;i<m+n;i++)
        {
            if(j==m)
            {
                for(a=i;a<m+n;a++)
                {
                    arr[a]=nums2[k];
                    k++;
                }
                break;
            }
            if(k==n)
            {
              for(a=i;a<m+n;a++)
                {
                    arr[a]=nums1[j];
                    j++;
                }
                break;
            }

            if(nums1[j]>nums2[k])
            {
                arr[i]=nums2[k];
                k++;
            }
            else
            {
                arr[i]=nums1[j];
                j++;
            }
        }
        for(i=0;i<m+n;i++)
        {
            nums1[i]=arr[i];
        }
      
    }
}