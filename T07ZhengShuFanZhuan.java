import com.sun.javafx.collections.MappingChange;

import java.util.Scanner;

/*
T7整数反转
 */
class T7ZhengShuFanZhuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(FanZhuan(i));
    }

    public static int FanZhuan(int i){
        int ii = i,count = 0;
        while(ii!=0){
            ii = ii/10;
            count++;
        }

        int[] Gi = new int[count];
        for (int k = 0;k < count;k++){
            Gi[k] = i%10;
            i = i/10;
        }


        int j = 0,c = 0;
        for (int k = Gi.length - 1;k >= 0;k--) {
            j += Gi[k] * Math.pow(10, c);
            c++;
        }
        return j;
    }
}
