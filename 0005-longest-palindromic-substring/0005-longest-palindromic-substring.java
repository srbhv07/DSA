class Solution {
    public boolean solve(String s,int left , int right)
    {
        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public String longestPalindrome(String s) {

        int n = s.length();

        int max = 0;
        int start = 0;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                if(solve(s,i,j))
                {
                    if(j-i+1 > max) 
                    {
                        start = i;
                        max = j-i+1;
                    }
                }
            }
        }
        return s.substring(start,start+max);
        
    }
}