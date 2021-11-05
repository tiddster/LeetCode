public class T1556 {
    public String thousandSeparator(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        StringBuffer res = new StringBuffer();
        int j=0;
        for(int i=chars.length - 1; i>=0; i--){
            j++;
            if(j==3 && i!=0){
                j=0;
                res.append(chars[j]).append(".");
            } else {
                res.append(chars[j]);
            }
        }
        return res.reverse().toString();
    }
}
