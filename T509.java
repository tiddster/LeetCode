import java.util.HashMap;
import java.util.Map;

public class T509 {
    Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n<=1) return n;
        if(map.containsKey(n)) return map.get(n);
        else{
            map.put(n,fib(n)+fib(n-1));
            return map.get(n);
        }
    }
}
