/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 */
public class T3ZiFuChuan {
    public static int lengthOfLongestSubstring(String s) {
        int i=0,j,max=0;
        for(j=i; j<s.length();j++){
            for(int k=i;k<j;k++){
                int temp;
                if(s.charAt(k)==s.charAt(j)){
                    temp = j-i;
                    if(temp>max)
                        max = temp;
                    i = k+1;
                    break;
                }
            }
        }
        return j-i>max?j-i:max;
    }
}
