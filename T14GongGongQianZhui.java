/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */
public class T14GongGongQianZhui {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        for(int i=0; i<strs[0].length(); i++){
            boolean k=true;
            for(int j=0; j<strs.length; j++){
                if(i>=strs[j].length()||strs[0].charAt(i) != strs[j].charAt(i)){
                    k=false;
                    break;
                }
            }
            if(k) s+=strs[0].charAt(i);
            else break;
        }
        return s;
    }
}
