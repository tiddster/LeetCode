/*
给定一个正整数 n ，输出外观数列的第 n 项。

「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。

你可以将其视作是由递归公式定义的数字字符串序列：

countAndSay(1) = "1"
countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 */
public class T38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(11));
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
        System.out.println(countAndSay(8));
        System.out.println(countAndSay(9));
        System.out.println(countAndSay(10));
    }
    public static String countAndSay(int n) {
        String res = "";
        String aim = "1";
        char temp;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            res = "";
            count = 0;
            temp = aim.charAt(0);
            for (char c : aim.toCharArray()) {
                if(c == temp) {
                    count++;
                } else {
                    res += String.valueOf(count) + String.valueOf(temp);
                    temp = c;
                    count = 1;
                }
            }
            res += String.valueOf(count) + String.valueOf(temp);
            aim = res;
        }
        return aim;
    }
}
