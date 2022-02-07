import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T1405 {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        Pair[] pair = new Pair[]{new Pair(a,'a'),new Pair(b,'b'),new Pair(c,'c')};
        while(true){
            Arrays.sort(pair,(p1, p2) -> p2.num - p1.num);
            boolean hasNext = false;
            for(Pair p : pair){
                if(p.num<=0) break;
                int m = res.length();
                if (m >= 2 && res.charAt(m - 2) == p.ch && res.charAt(m - 1) == p.ch) {
                    continue;
                }
                hasNext = true;
                res.append(p.ch);
                p.num--;
                break;
            }
            if (!hasNext) {
                break;
            }
        }
        return res.toString();
    }

    class Pair {
        int num;
        char ch;

        public Pair(int num, char ch) {
            this.num = num;
            this.ch = ch;
        }
    }
}
