import java.util.HashMap;
import java.util.Map;

public class T1137 {
    Map<Integer,Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;

        if(map.containsKey(n)) return map.get(n);
        else{
            map.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
            return map.get(n);
        }
    }
}
