public class T838 {
    public String pushDominoes(String dominoes) {
        StringBuilder domino = new StringBuilder();
        domino.append("L").append(dominoes).append("R");
        char[] chars = domino.toString().toCharArray();
        String res = "";
        for (int l = 0, r = 1; r < chars.length; r++) {
            System.out.println(l);
            if (chars[r] == 'L') {
                if (chars[l] == 'L') {
                    while (l < r) {
                        res += "L";
                        l++;
                    }
                } else if (chars[l] == 'R') {
                    double mid = (double) (l + r) / 2;
                    while (l < r) {
                        if (l < mid) {
                            res += "R";
                        } else if ((double) l == mid) {
                            res += ".";
                        } else if (l > mid) {
                            res += "L";
                        }
                        l++;
                    }
                }
                l = r;
            } else if (chars[r] == 'R') {
                if (chars[l] == 'R') {
                    while (l < r) {
                        res += "R";
                        l++;
                    }
                } else if (chars[l] == 'L') {
                    res += "L";
                    l++;
                    while (l < r) {
                        res += ".";
                        l++;
                    }
                }
                l = r;
            }
        }
        return res.substring(1, domino.length() - 1);
    }
}
