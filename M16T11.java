public class M16T11 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k==0){
            int[] s = new int[]{};
            return s;
        }
        if(shorter == longer){
            int[] s = new int[]{shorter*k};
            return s;
        }

        int start = shorter*k;
        int[] res = new int[k+1];
        for(int i=0; i<=k; i++){
            res[i] = start;
            start += longer - shorter;
        }
        return res;
    }
}
