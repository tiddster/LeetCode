public class T14GongGongQianZhui2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String s = strs[0];
        String s2 = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < s.length()) {
                s = strs[i];
            }
        }

        for (int i = 0; i <= s.length(); i++) {
            boolean k = true;
            for (String string : strs) {
                if (s.substring(0, i).equals(string.substring(0, i))) {
                    k = true;
                } else {
                    k = false;
                    break;
                }
            }
            if (k) s2 = s.substring(0, i);
            else return s2;
        }
        return s2;
    }
}
