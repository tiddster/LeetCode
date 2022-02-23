public class T917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            if (!Character.isLetter(chars[l])) {
                l++;
            }
            if (!Character.isLetter(chars[r])) {
                r--;
            }
            if (Character.isLetter(chars[l]) &&
                    Character.isLetter(chars[r])) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }
}
