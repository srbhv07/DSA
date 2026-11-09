class Solution {
    public int beautySum(String s) {

      
        int cnt = 0;
        int n = s.length();

        for(int  i = 0 ; i< n ; i++)
        {

            int arr[] = new int[26];





            for(int j = i; j<n ; j++ )
            {
                arr[s.charAt(j) - 'a']++;


                int max = 0;
                int min = Integer.MAX_VALUE;


                for(int k = 0 ; k<26 ; k++)
                {
                    if(arr[k] > 0)
                    {

                    
                   if(arr[k] > max)
                   {
                    max = arr[k];
                   }
                   if(arr[k] < min)
                   {
                    min = arr[k];
                   }
                   }
                } 
                cnt = cnt + (max- min);

            }
        }


        return cnt;
        
    }
}