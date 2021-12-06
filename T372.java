import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class T372 {
    int base = 1337;
    public int superPow(int a, int[] b) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(int num : b)
            queue.addLast(num);
        return superPow(a, queue);
    }

    private int superPow(int a, Deque<Integer> queue){
        if(queue.isEmpty())
            return 1;

        int lastBit = queue.removeLast();

        int part1 = quickPow(a, lastBit);
        int part2 = quickPow(superPow(a,queue), 10);

        return (part1 * part2) % base;
    }

    /**
    *      (a * b) % k = [(a % k) * (b % k)] % k
     **/

    private int quickPow(int a, int b){
        if(b == 0)
            return 1;


        if(b % 2 == 0)
            return quickPow( ((a % base) * (a % base)) % base, b / 2);
        else
            return ( (a % base) * quickPow(a,b-1) ) % base;
    }
}
