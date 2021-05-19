import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T15ThreeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int[] i = new int[max];
        for(int j = 0;j < max; j++){
            i[j] = in.nextInt();
        }
        List<int[]> list = ThreeSum(i);
        for(int j = 0 ; j < list.size();j++){
            System.out.println(Arrays.toString(list.get(j)));
        }
    }
    public static List<int[]> ThreeSum(int[] i){
        int len = i.length;
        int p = 0;
        List<int[]> list = new ArrayList<>();
        int[][] result = new int[100][3];
        for(int j = 0;j < len;j++){
            for(int n = j+1;n < len;n++)
                for(int m = n+1;m < len;m++)
                    if (i[j] + i[m] + i[n] == 0){
                        result[p][0] = i[j];
                        result[p][1] = i[n];
                        result[p][2] = i[m];
                        list.add(result[p]);
                        p++;
                     }
        }
        return list;
    }
}
