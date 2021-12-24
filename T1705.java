public class T1705 {
    public int eatenApples(int[] apples, int[] days) {
        int count=0;
        int[] dp = new int[apples.length+20000];
        for(int i = apples.length-1;i>=0;i--){
            for(int j=i + days[i] - 1;j>=i && apples[i]>0;j--){
                if(dp[j]==0){
                    dp[j] = Math.max(j - apples[i] + 2, i + 1);
                    count++;
                    apples[i]--;
                }else{
                    j = dp[j] - 1;
                }
            }
        }
        return count;
    }
}
