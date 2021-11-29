import java.util.Arrays;

/*
给定一个整数数组，判断是否存在重复元素。

如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class T217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i< nums.length; i++){
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}
