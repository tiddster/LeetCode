import java.util.Stack;

/*
给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 */
public class T32longestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(""));
    }
    public static int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(chars[i] == '('){
                stack.push(i);
            } else {
                stack.pop();
                if(stack.isEmpty()) stack.push(i);
                else{
                    max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
