import java.util.Scanner;

/*
T6Z字形转换
 */
public class T6Z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int Row = in.nextInt();
        System.out.println(convert(s,Row));
    }

    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        String Z = "";
        int numOfGroup = numRows * 2 - 2;
        for(int i = 0;i < numOfGroup/2 + 1; i++)
            for(int j = i;j < s.length();j += numOfGroup){
                Z += s.charAt(j);
                int m = (j/numOfGroup+1)*numOfGroup - i;           //每一组与j同行的位置
                if(i != 0 && i != numOfGroup/2 && m <= s.length())
                    Z += s.charAt(m);
            }
        return Z;
    }
}
