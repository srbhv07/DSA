class Solution {
    public int solve(int[] coins, int amount,int idx,int dp[][])
    {
        if(idx == 0)
        {
            if(amount%coins[0] == 0)
            {
                return amount / coins[0];
            }

            return (int) 1e9;


        }

        if(dp[idx][amount] != -1)
        {
            return dp[idx][amount];
        }


        
        int take = (int) 1e9;


        if(coins[idx] <= amount)
        {
            take = 1+solve(coins,amount-coins[idx],idx,dp);
        }
            int nottake = solve(coins,amount,idx-1,dp);

           return  dp[idx][amount ] = Math.min(take,nottake);

        

    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int dp[][] = new int [n+1][amount+1];


        for(int i = 0 ; i<= n ; i++)
        {
            Arrays.fill(dp[i],-1);
        }

        int ans =  solve(coins,amount,n-1,dp);
        return (ans >= (int) 1e9) ? -1 : ans;
    }
}