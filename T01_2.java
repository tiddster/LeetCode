import java.util.HashMap;
import java.util.Map;

public class T01_2 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{};
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
