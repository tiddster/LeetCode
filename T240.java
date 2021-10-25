/*
编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int maxX = matrix.length;
        int maxY = matrix[0].length;
        if(maxX == 0||maxY == 0) return false;
        int x = maxX - 1, y = 0;
        while(x>=0 && x<maxX && y>=0 && y<maxY){
            if(matrix[x][y] < target) y++;
            else if(matrix[x][y] > target) x--;
            else return true;
        }
        return false;
    }
}
