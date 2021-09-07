import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
分割平衡字符串

在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。

给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。

注意：分割得到的每个字符串都必须是平衡字符串。

返回可以通过分割得到的平衡字符串的 最大数量
 */
public class T1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        char inStack = 'R';
        char[]  cs =  s.toCharArray();
        List<String> list = new ArrayList<>();
        String string = "";
        Stack<Character> characterStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(characterStack.isEmpty()) {
                if(!string.equals("")){
                    list.add(string);
                    string = "";
                }
                inStack = cs[i];
                characterStack.push(inStack);
            } else {
                if(cs[i] == inStack) characterStack.push(cs[i]);
                else characterStack.pop();
            }
            string += cs[i];
            System.out.println(string);
        }
        list.add(string);
        return list.size();
    }
}
