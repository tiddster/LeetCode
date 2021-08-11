public class T791 {
    public static void main(String[] args) {
        System.out.println(customSortString("cba","abcd"));
    }
    public static String customSortString(String order, String s) {
        String res = "";
        String temp = "";
        char[] orderList = order.toCharArray();
        char[] sList;
        for(int i=0; i<order.length(); i++){
            sList = s.toCharArray();
            for(int j=0; j<s.length(); j++){
                if(orderList[i] == sList[j]){
                    res += sList[j];
                    temp += sList[j];
                }
            }
        }
        for(char c : temp.toCharArray()){
            s = s.replace(String.valueOf(c),"");
            System.out.println(s);
        }
        res += s;
        return res;
    }
}
