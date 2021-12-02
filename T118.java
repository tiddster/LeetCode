import java.util.ArrayList;
import java.util.List;

public class T118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> YHList = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> InList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) InList.add(1);
                else InList.add(YHList.get(i-1).get(j-1)+YHList.get(i-1).get(j));
            }
            YHList.add(InList);
        }
        return YHList;
    }
}
