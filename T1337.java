/*
给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。

请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。

如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。

军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class T1337 {
    public static void main(String[] args) {
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int n = mat[0].length;
        boolean[] isAdded = new boolean[mat.length];
        Arrays.fill(isAdded, false);
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = mat.length - 1; j >= 0; j--) {
                if (mat[j][i] == 1 && !isAdded[j]) {
                    stack.push(j);
                    isAdded[j] = true;
                }
            }
        }
        for(int j = mat.length - 1; j >= 0; j--){
            if(!isAdded[j]) stack.push(j);
        }
        int[] res = new int[k];
        int i=0;
        while(!stack.isEmpty() && i<k) {
            res[i] = stack.pop();
            i++;
        }
        return res;
    }
}
