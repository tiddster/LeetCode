/*
给你一个字符串 s，找到 s 中最长的回文子串。
 */

public class T05ZhuiChangHuiWenShui {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        int max = 0;
        String str = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(Judge(s,i,j)) {
                    if(j-i+1>max){
                        max = j-i+1;
                        str = s.substring(i,j+1);
                    }
                }
            }
        }
        return max==0? String.valueOf(s.charAt(0)) :str;
    }

    public static boolean Judge(String s,int n, int m){
        boolean isHui = true;
        for(int i=n, j=m; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                isHui = false;
                break;
            }
        }
        return isHui;
    }
}
