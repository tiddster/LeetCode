import java.util.Arrays;

public class O73 {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1, right = piles[piles.length-1];
        while(left!=right){
            int mid = (left + right) / 2;
            if (isFinish(mid, piles, h))
                right = mid;
            else left = mid+1;
        }
        return left;
    }

    public boolean isFinish(int speed, int[] piles, int h){
        int hour = 0;
        for(int e : piles){
            hour += ((e/speed) + (e%speed==0?0:1));
        }
        return hour<=h;
    }
}
