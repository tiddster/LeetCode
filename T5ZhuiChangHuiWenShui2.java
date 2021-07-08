public class T5ZhuiChangHuiWenShui2 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("dd"));
    }
    public static String longestPalindrome(String s) {
        int max = 0;
        String str = "";
        for(int i=0; i<s.length(); i++){
            int length;
            length = Math.max(Judge(s, i, i), Judge(s, i, i + 1));
            if(length>max){
                max = length;
                System.out.println(max);
                if(length%2==0) {
                    str = s.substring(i-length/2+1,i+length/2+1);
                } else {
                    str = s.substring(i-length/2,i+length/2+1);
                }
            }
        }
        return max==0? String.valueOf(s.charAt(0)) : str;
    }
    public static int Judge(String s, int n, int m){
        while(true){
            if(n<0||m>=s.length()){
                break;
            }
            if(s.charAt(n) != s.charAt(m)){
                break;
            }
            n--;m++;
        }
        return m-n-1;
    }
}
