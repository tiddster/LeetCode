public class T35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(target<nums[mid]) high = mid-1;
            else if(target==nums[mid]) return mid;
            else low = mid+1;
        }
        return high+1;
    }
}
