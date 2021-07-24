/*
给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。

有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。

替换 time 中隐藏的数字，返回你可以得到的最晚有效时间。
 */
public class T1736 {
    public static void main(String[] args) {
        System.out.println(maximumTime("2?:?0"));
    }
    public static String maximumTime(String time) {
        char[] Time = time.toCharArray();
        for(int i=0; i<5; i++){
            if('?' == Time[i]){
                switch (i){
                    case 0:
                        Time[0] = ('4' <= Time[1] && Time[1] <= '9')  ? '1' : '2';
                        break;
                    case 1:
                        Time[1] = Time[0] == '2' ? '3' : '9';
                        break;
                    case 4:
                        Time[4] = '9';
                        break;
                    case 3:
                        Time[3] = '5';
                        break;
                }
            }
        }
        return String.valueOf(Time);
    }
}
