/*
给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。

请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。

nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 */
public class T496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int temp = 0;
            boolean isFindSame = false, isFindBetter = false;
            for(int j=0; j< nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    temp = nums2[j];
                    isFindSame = true;
                }
                if(isFindSame)
                    if(nums2[j] > temp){
                        res[i] = nums2[j];
                        isFindBetter = true;
                        break;
                    }
            }
            if(!isFindBetter) res[i] = -1;
        }
        return res;
    }
}
