public class T566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;

        int k=0,l=0;
        int res[][] = new int[r][c];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[k][l] = mat[i][j];
                l++;
                if(l==c){
                    l=0;
                    k++;
                }
            }
        }
        return res;
    }
}
