public class T274HShu2 {
    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {
        int h = 0;
        int i = citations.length-1;
        while(citations[i]>h){
            h++;
            i--;
            if(i<0) break;
        }
        return h;
    }
}
