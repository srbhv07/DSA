class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;

        int right = Arrays.stream(piles).max().getAsInt();

        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(caneatallbananas(piles,mid,h))
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left ;
    }
    public boolean caneatallbananas(int [] piles,int givenhour , int h)
    {
        int actualhour = 0;

        for(int x : piles)
        {
            actualhour = actualhour + x/givenhour;

            if(x%givenhour != 0)
            {
                actualhour++ ;
            }
        }

        return actualhour<= h;
    }
}