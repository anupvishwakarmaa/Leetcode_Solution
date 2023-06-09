class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        if(i==0 && j==0) dp[i][j]=grid[i][j];
        else{
        int up=0,left=0;
        if(i>0)up=grid[i][j]+dp[i-1][j];
        else up=(int)Math.pow(10,9);
        if(j>0)left=grid[i][j]+dp[i][j-1];
        else left=(int)Math.pow(10,9);
        dp[i][j]=Math.min(up,left);
            }}
        }
        return dp[m-1][n-1];
    }
}