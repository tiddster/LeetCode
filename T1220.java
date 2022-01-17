public class T1220 {
    public static void main(String[] args) {

    }

    int MOD = 1000000007;
    public int countVowelPermutation(int n) {
        // 定义dp[i][j] 长度为i的以j号字符结尾的个数
        int dp[][] = new int[n + 1][5];
        // 初始化条件 dp[1][0~4] = 1
        for (int i = 0; i < 5; ++i) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = ((dp[i - 1][1] + dp[i - 1][2]) % MOD + dp[i - 1][4]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % MOD;
            dp[i][3] = dp[i - 1][2];
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
        }
        int ans = 0;
        for(int i = 0; i < 5; i++){
            ans += dp[n][i];
            ans %= MOD;
        }
        return ans;
    }
}
