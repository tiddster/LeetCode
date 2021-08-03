import java.util.Arrays;

/*
给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。

请你找出符合题意的 最短 子数组，并输出它的长度。。
 */
public class T581 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(a));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int[] sortedNum = Arrays.copyOf(nums, nums.length);
        int k = 0, last = -1;
        Arrays.sort(sortedNum);
        for (int i = 0; i < nums.length; i++) {
            if (sortedNum[i] != nums[i]) {
                k = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sortedNum[i] != nums[i]) {
                last = i;
                break;
            }
        }
        return last - k + 1;
    }
}
