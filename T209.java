/*
给定一个含有 n 个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class T209 {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int sum = 0;
        int len = 0;
        for(; end < nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                len = len == 0 ? end - start + 1 : Math.min(len, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return len;
    }
}
