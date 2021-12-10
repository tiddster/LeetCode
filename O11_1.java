import java.util.HashMap;
import java.util.Map;

public class O11_1 {
    Map<Integer, Integer> map = new HashMap<>();
    public int numWays(int n) {
        if(n==0) return 1;
        if(n<=2) return n;
        else{
            if(map.containsKey(n)) return map.get(n);
            else{
                map.put(n, (numWays(n - 1) + numWays(n - 2)) % 1000000007);
                return map.get(n);
            }
        }
    }
}
