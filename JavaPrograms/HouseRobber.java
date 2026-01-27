class HouseRobber {
    public int loot(int[] arr,int i,int[] dp)
    {
        if(i<0) return 0;
        if(i==0) return arr[0];
        if(dp[i]!=-1) return dp[i];
        int Pick=arr[i]+loot(arr,i-2,dp);
        int notPick=loot(arr,i-1,dp);
        return dp[i]=Math.max(Pick,notPick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int res=loot(nums,n-1,dp);
        return res;
    }
}
