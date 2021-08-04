import java.util.Arrays;

/*
给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
 */
public class T611triangleNumber {
    public static void main(String[] args) {
        int[] a = new int[]{2,2,3,4};
        System.out.println(triangleNumber(a));
    }
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=nums.length - 1; i>=2; i--){
            int n = i-1, m = 0;
            while(m < n) {
                /*
                System.out.print(nums[i]);
                System.out.print(nums[m]);
                System.out.println(nums[n]);
                 */
                if (nums[n] + nums[m] > nums[i]){
                    result += n - m;
                    n--;
                } else {
                    m++;
                }
            }
        }
        return result;
    }
}
