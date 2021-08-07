/*
给你两个长度相等的整数数组，返回下面表达式的最大值：

|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

其中下标 i，j 满足 0 <= i, j < arr1.length。
 */

import java.util.Arrays;

public class T1131 {
    public static void main(String[] args) {
    }
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int minA = Integer.MAX_VALUE, minB, minC, minD;
        int maxA = Integer.MIN_VALUE, maxB, maxC, maxD;
        minB = minC = minD = minA;
        maxB = maxC = maxD = maxA;

        int resMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr1.length; i++) {
            minA = Math.min(minA, arr1[i]+arr2[i]+i);
            maxA = Math.max(maxA, arr1[i]+arr2[i]+i);

            minB = Math.min(minB, arr1[i]+arr2[i]-i);
            maxB = Math.max(maxB, arr1[i]+arr2[i]-i);

            minC = Math.min(minC, arr1[i]-arr2[i]+i);
            maxC = Math.max(maxC, arr1[i]-arr2[i]+i);

            minD = Math.min(minD, arr1[i]-arr2[i]-i);
            maxD = Math.max(maxD, arr1[i]-arr2[i]-i);

            resMax = Math.max(Math.max(maxA-minA, maxB-minB), Math.max(maxC-minC, maxD-minD));
        }

        return resMax;
    }
}
