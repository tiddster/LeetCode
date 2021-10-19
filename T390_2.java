import java.util.ArrayList;
import java.util.List;

public class T390_2 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(14));
    }
    public static int lastRemaining(int n) {
        int remain = n;
        boolean canDivide = true;
        int dis = 1;
        int res = 1;
        while(remain>1){
            if(canDivide||remain%2==1) res+=dis;
            canDivide = !canDivide;
            dis*=2;
            remain/=2;
        }
        return res;
    }
}
