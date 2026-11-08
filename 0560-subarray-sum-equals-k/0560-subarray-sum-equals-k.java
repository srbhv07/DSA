class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map =  new HashMap<>();

        map.put(0,1); // 0 , 1 daal detaa huu agar [1,-1] sum = 0 , eskee liyee

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n ; i++)
        {
            sum = sum + nums[i];
            int rem = sum - k;

            if(map.containsKey(rem))
            {
                cnt = cnt + map.get(rem);
            }

            map.put(sum,map.getOrDefault(sum,0) + 1);


        }

        return cnt;

        
    }
}