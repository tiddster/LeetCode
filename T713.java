public class T713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int res=1, count=0, left=0;
        for (int right=0; right<nums.length; right++) {
            res *= nums[right];
            while (res>=k) res/=nums[left++];
            count += right - left + 1;
        }
        return count;
    }
}
