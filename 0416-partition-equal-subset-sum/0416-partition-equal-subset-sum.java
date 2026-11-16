class Solution {


    public boolean solve(int[] nums,int target,int n,boolean dp[][])
    {
       

        for(int i = 0 ; i< n+1 ; i++)
        {
            dp[i][0] = true;
        }

       for(int i = 1 ; i < n+1 ; i++)
       {
        for(int j = 1 ; j< target+1 ; j++)
        {
            if(nums[i-1] > j)
            {
                dp[i][j] = dp[i-1][j];
            }
            else
            {
                boolean nottake = dp[i-1][j];
                boolean take = dp[i-1][j-nums[i-1]];


                dp[i][j] = take || nottake;

            }
        }
       }


        
            
     

       

        return dp[n][target];

    }
    public boolean canPartition(int[] nums) {
        

        int n = nums.length;

        int target = 0;

        for(int i = 0 ; i< n ; i++)
        {
            target += nums[i];
        }

        if(target % 2 == 1)
        {
            return false;
        }

        target = target/2;

        boolean dp[][] = new boolean [n+ 1][target+1];

    
        return  solve(nums,target,n,dp);
    }
}