public class T1189 {
    public int maxNumberOfBalloons(String text) {
        char[] chars = new char[26];
        for(char c: text.toCharArray()){
            chars[c-'a']++;
        }
        int a = chars['a'-'a'];
        int b = chars['b'-'a'];
        int l = chars['l'-'a'];
        int o = chars['o'-'a'];
        int n = chars['n'-'a'];

        return Math.min(Math.min(a,b),Math.min(Math.min(l/2,o/2),n));
    }
}
