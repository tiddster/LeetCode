import java.util.ArrayList;
import java.util.List;

public class T1816 {
    public String truncateSentence(String s, int k) {
        String res = "";
        int i=0;
        for(char c : s.toCharArray()){
            res += c;
            if(c==' '){
                res+=" ";
                if(++i==k) break;
            }
        }
        return res.substring(0,res.length()-1);
    }
}
