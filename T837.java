public class T837 {
    public double new21Game(int n, int k, int maxPts) {
        if (n - k + 1 >= maxPts) {
            return 1.0;
        }
        double[] dp = new double[k + maxPts];
        // 将能赢得游戏的点数的概率设置为 1
        for (int i = k; i <= n; i++) {
            dp[i] = 1.0;
        }
        // 计算K + W 这几个点数的概率和
        double sumProb = n - k + 1;
        // 从 K - 1 开始计算，
        for (int i = k - 1; i >= 0; i--) {
            // 点数为 i 的赢得游戏的概率为 i + 1 ~ i + W 的概率和除以 W
            dp[i] = sumProb / maxPts;
            sumProb = sumProb - dp[i + maxPts] + dp[i];
        }

        return dp[0];
    }
}
