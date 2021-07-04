import java.util.Scanner;

/*
T9 回文数
 */
class T9HuiWenShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        if(HuiWen(i) == true)
            System.out.println(i+"是回文数");
        else
            System.out.println(i+"不是回文数");
    }

     public static boolean HuiWen(int i){
        if(i<0)
            return false;
        else{
            int ii = i,count = 0;
            while(ii!=0){
                ii = ii/10;
                count++;
            }

            int[] Gi =new int[count];

            for(int k = 0;k < count;k++){
                Gi[k] = i%10;
                i = i/10;
            }

            int n = 0,m = Gi.length - 1;
            while (n < m){
                if (Gi[n] != Gi[m]) {
                    return false;
                }
                n++;
                m--;
            }
            return true;
        }
    }
}
