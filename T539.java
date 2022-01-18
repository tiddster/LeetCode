import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T539 {
    public int findMinDifference(List<String> timePoints) {
        int length = timePoints.size();
        int[] minutes = new int[length];
        for(int i=0; i<length; i++){
            String time = timePoints.get(i);
            minutes[i] = time.charAt(0)*10*60
                    +time.charAt(1)*60
                    +time.charAt(3)*10
                    +time.charAt(4);
        }
        Arrays.sort(minutes);
        int interval = Integer.MAX_VALUE;
        for (int i = 1; i < length; i++) {
            interval = Math.min(interval, minutes[i] - minutes[i - 1]);
        }
        return Math.min(interval, minutes[0] + 1440 - minutes[minutes.length - 1]);
    }
}
