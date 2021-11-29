/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class T53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], res = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum<0) sum = nums[i];
            else sum += nums[i];
            res = Math.max(sum,res);
        }
        return res;
    }
}
