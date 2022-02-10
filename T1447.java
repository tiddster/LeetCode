import java.util.ArrayList;
import java.util.List;

public class T1447 {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                if(!hasDivisor(i,j)){
                    list.add(String.valueOf(j)+"/"+String.valueOf(i));
                }
            }
        }
        return list;
    }

    public boolean hasDivisor(int a, int b){
        for(int i=2; i<Math.min(a,b);i++){
            if(a%i==0&&b%i==0) return true;
        }
        return false;
    }
}
