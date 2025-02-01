class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> L= new LinkedList<>();
        int n=candies.length;
        int i,max=candies[0],s=0;
        for(i=0;i<n;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
            else if(candies[i]>s)
            {
                s=candies[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if((candies[i]+extraCandies >= max && candies[i]!=max))
            {
                L.add(true);
            }
            else if(candies[i]==max)
            {
                L.add(true);
            }
            else
            {
                L.add(false);
            }
        }
        return L;
    }
}