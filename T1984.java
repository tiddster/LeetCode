import java.util.Arrays;

public class T1984 {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int l=0, r=l+k-1; r<nums.length; l++, r++){
            min = Math.min(min, nums[r]-nums[l]);
        }
        return min;
    }
}
