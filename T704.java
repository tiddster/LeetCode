/*
二分查找：
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class T704 {
    public static void main(String[] args) {
        int[] a = new int[]{-1,0,3,5,9,12};
        System.out.println(search(a,2));
    }

    public static int search(int[] nums, int target) {
        return ToSearch(target, 0, nums.length - 1, nums);
    }

    public static int ToSearch(int target, int start, int end, int[] nums){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target){
            return  ToSearch(target, start, mid-1, nums);
        } else {
            return ToSearch(target, mid+1, end, nums);
        }
    }
}
