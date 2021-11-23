public class T859 {
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ab";
        System.out.println(buddyStrings(s,goal));
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int[] alpOfS = new int[26];
        int[] alpOfGoal = new int[26];

        int differOfChar = 0;
        for(int i=0; i<s.length(); i++){
            alpOfS[s.charAt(i) - 'a']++;
            alpOfGoal[goal.charAt(i) - 'a']++;
            if(s.charAt(i) != goal.charAt(i)) differOfChar++;
            if(differOfChar>2) return false;
        }

        if(s.equals(goal)){
            for(int i=0;i<26;i++){
                if(alpOfS[i]>=2){
                    return true;
                }
            }
            return false;
        }

        int differOfInt = 0;
        for(int i=0; i<26; i++){
            differOfInt += Math.abs(alpOfS[i] - alpOfGoal[i]);
            if(differOfInt>2) return false;
            if(!s.equals(goal) && differOfInt >= 2) return false;
        }

        return true;
    }
}
