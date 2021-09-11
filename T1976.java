/*
给你一个字符串数组 patterns 和一个字符串 word ，统计 patterns 中有多少个字符串是 word 的子字符串。返回字符串数目。

子字符串 是字符串中的一个连续字符序列。
 */
public class T1976 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0; i< patterns.length; i++){
            if(word.contains(patterns[i])) count++;
        }
        return count;
    }
}
