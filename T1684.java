/*
给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。

请你返回 words 数组中 一致字符串 的数目。
 */
public class T1684 {
    public static void main(String[] args) {

        System.out.println();
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for(String str : words){
            int count = str.length();
            for(char c: str.toCharArray()){
                if(allowed.contains(String.valueOf(c))){
                    count--;
                }
            }
            if(count == 0) res++;
        }
        return res;
    }
}
