import java.util.Arrays;

/*
给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。

如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。

已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T1893isCovered {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,10},{10,20}};
        System.out.println(isCovered(ints,21,21));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left; i<=right; i++) {
            for(int[] ints : ranges){
                if(i>=ints[0]&&i<=ints[1]){
                    break;
                }
                if(Arrays.equals(ints, ranges[ranges.length - 1])){
                    return false;
                }
            }
        }
        return true;
    }
}
