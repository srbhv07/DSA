class Solution {


    public int  solve(int[] nums,int target,int idx,int dp[][])
    {
        if(idx >= nums.length  || target < 0)
        {
            return  0;
        }

        if(target == 0)
        {
            return dp[idx][target] = 1;
            
        }


        if(dp[idx][target] != -1)
        {
            return dp[idx][target];
        }


        int take = solve(nums,target - nums[idx] , idx+1 ,dp);


        int nottake = solve(nums, target , idx+1 ,dp);


        return dp[idx][target] =  ((take == 1) || (nottake == 1))==true?1:0;

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

        int dp[][] = new int [n+ 1][target+1];

        for(int i = 0 ; i<= n ; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return  solve(nums,target,0,dp) == 1;
    }
}