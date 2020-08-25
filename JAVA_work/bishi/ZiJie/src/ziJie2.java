public class ziJie2 {
    /*
    * 挖矿问题， 给定一个数组，每个数组有正负值，代表挖矿能取得的收益，不能挖相邻的矿，问能取得的最大收益(动态规划)
    * */

    public static void main(String[] args) {
        int[]ca = {2,-1,-5,3,4};
        int sum = guihua(ca);
        System.out.println(sum);
    }

    public static int guihua(int[] num){
        int n=num.length;
        int[][]dp=new int[n][n];
        dp[0][0] = 0;
        dp[0][1] = num[0];
        for (int i = 1; i <n ; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0]+num[i];
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
