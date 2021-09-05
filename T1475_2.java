import java.util.Arrays;
import java.util.Stack;

/*
用单调栈的方法写
The Next Greater
 */
public class T1475_2 {
    public static void main(String[] args) {
        int[] a = new int[]{8,7,4,2,8,1,7,7,10,1};
        System.out.println(Arrays.toString(finalPrices(a)));
    }
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> S = new Stack<>();
        for(int i=0;i<prices.length;++i)
        {
            while(!S.empty() && prices[i] <= prices[S.peek()]) {
                prices[S.peek()] -= prices[i];
                S.pop();
            }
            S.push(i);
        }
        return prices;
    }
}
