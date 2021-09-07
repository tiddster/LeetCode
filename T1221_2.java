public class T1221_2 {
    public static int balancedStringSplit(String s) {
        int nums = 0;
        int flag = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') flag++;
            else flag--;
            if (flag == 0) nums++;
        }
        return nums;
    }
}
