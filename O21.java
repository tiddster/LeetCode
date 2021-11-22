public class O21 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int num : nums) {
            if ((num%2) == 0) {
                res[right] = num;
                right--;
            } else {
                res[left] = num;
                left++;
            }
        }
        return res;
    }
}
