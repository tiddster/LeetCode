/*
给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 */
public class T409 {
    public int longestPalindrome(String s) {
        int[] a = new int[128];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            a[c]++;
        }

        int res = 0;
        boolean isDouble = false;
        for(int i=0; i<128; i++){
            res += a[i]/2;
            a[i] %= 2;
            if(a[i] == 1){
                isDouble = true;
            }
        }
        return isDouble? res*2+1 : res*2;
    }
}
