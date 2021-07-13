import java.util.ArrayList;
import java.util.List;

public class T6Z2 {
    public static void main(String[] args) {
        System.out.println(convert("leetcode",3));
    }
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> line = new ArrayList<StringBuilder>();
        for(int i = 0; i < numRows; i++)
            line.add(new StringBuilder());

        int i=0;
        boolean isGoDown = true;
        for(char c: s.toCharArray()){
            line.get(i).append(c);
            if(isGoDown) i++;
            else i--;
            if(i==numRows-1) isGoDown = false;
            else if(i==0) isGoDown = true;
        }

        String str = "";
        for(StringBuilder stringBuilder : line){
            str += stringBuilder.toString();
        }

        return str;
    }
}
