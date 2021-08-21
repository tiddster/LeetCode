/*
给你一个字符数组 chars ，请使用下述算法压缩：

从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：

如果这一组长度为 1 ，则将字符追加到 s 中。
否则，需要向 s 追加字符，后跟这一组的长度。
压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。需要注意的是，如果组长度为 10 或 10 以上，则在 chars 数组中会被拆分为多个字符。

请在 修改完输入数组后 ，返回该数组的新长度。

你必须设计并实现一个只使用常量额外空间的算法来解决此问题。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/string-compression
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T443 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a','a','b','c','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        String resStr = "";
        int count = 0;
        char rem = '/';
        for(char c : chars){
            if(rem == c){
                count++;
            } else {
                resStr = add(resStr,rem,count);
                rem = c;
                count = 1;
            }
        }
        resStr = add(resStr,rem,count);
        return resStr.length();
    }

    public static String add(String resStr, char rem, int count){
        if(count == 1) resStr += rem;
        else if(count > 1){
            resStr += rem;
            resStr += String.valueOf(count);
        }
        return resStr;
    }
}
