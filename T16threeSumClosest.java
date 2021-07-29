import java.util.Arrays;

public class T16threeSumClosest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,5,10,11};
        System.out.println(threeSumClosest(a, 12));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2], temp;
        for (int k = 0; k < nums.length; k++)
            for (int i = k + 1, j = nums.length - 1; i < j; ) {
                if (j == k) {
                    j--;
                    continue;
                }
                temp = nums[i] + nums[j] + nums[k];
                closest = Math.abs(target - closest) < Math.abs(target - temp) ? closest : temp;
                System.out.println(i + " " + j + " " + temp + " " + closest + " " + Math.abs(target - closest) + " " + Math.abs(target - temp));
                if (target > temp) i++;
                else if (target < temp) j--;
                else return closest;
            }
        return closest;
    }
}
