/*
给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。

如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 */
public class T766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix[0].length-1;i++){
            int temp1 = matrix[0][i];
            for(int n=0, m=i; n<matrix.length&&m<matrix[0].length;n++,m++){
                if(matrix[n][m] != temp1) return false;
            }
        }
        for(int i=0; i<matrix.length-1;i++){
            int temp2 = matrix[i][0];
            for(int n=0, m=i; n<matrix[0].length&&m<matrix.length;n++,m++){
                if(matrix[m][n] != temp2) return false;
            }
        }
        return true;
    }
}
