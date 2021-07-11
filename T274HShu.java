import java.util.Arrays;

public class T274HShu {
    public static void main(String[] args) {
        int[] citations = new int[]{3,0,1,6,5};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int i = citations.length-1;
        while(h<citations[i]){
            i--;
            h++;
            if(i<0) break;
        }
        return h;
    }
}
