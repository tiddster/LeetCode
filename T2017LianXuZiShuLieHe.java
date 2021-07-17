/*
输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 */

public class T2017LianXuZiShuLieHe {
    public static void main(String[] args) {
        int[] a =new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i : nums){
            sum += i;
            if(sum<0) {
                max = Math.max(max, i);
                sum = 0;
            } else {
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
