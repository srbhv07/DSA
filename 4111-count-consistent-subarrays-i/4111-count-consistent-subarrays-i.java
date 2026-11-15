class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;


        int cnt = 0 ;
        for(int i = 0 ; i< n ; i++)
        {
            int minvalue = nums[i] ;
            int num = nums[i];
            for(int j = i ; j < n ; j++)
            {
                num = num & nums[j];

                minvalue = Math.min(nums[j],minvalue);


                if(minvalue == num)
                {
                    cnt++;
                }


            }
        }

        return cnt;
        
    }
}