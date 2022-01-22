import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class polo {
    public static void main(String[] args) {
        String str = "5+6-8*9-1+7";
        System.out.println(HOU(str.toCharArray()));
        System.out.println(Calculate(HOU(str.toCharArray())));
    }

    static Queue<Character> HOU(char[] chars){
        Queue<Character> numQueue = new LinkedList<>();
        Stack<Character> symStack = new Stack<>();
        int num = 0;
        for(char c:chars){
            if(c<='9' && c>='0') {
                numQueue.add(c);
            }
            else if(c=='(') symStack.push(c);
            else if(c==')'){
                while(symStack.peek()!='('){
                    numQueue.add(symStack.pop());
                }
                symStack.pop();
            } else if(c=='+'||c=='-'){
                while(!symStack.isEmpty()&&(symStack.peek()=='+'
                        || symStack.peek()=='/'
                        ||symStack.peek()=='*'
                        ||symStack.peek()=='-'))
                    numQueue.add(symStack.pop());
                symStack.push(c);
            } else if(c=='*'||c=='/'){
                while(!symStack.isEmpty()&&(symStack.peek()=='*'||symStack.peek()=='/'))
                    numQueue.add(symStack.pop());
                symStack.push(c);
            }
        }

        while(!symStack.isEmpty()) numQueue.add(symStack.pop());
        return numQueue;
    }

    static int Calculate(Queue<Character> hou){
        Stack<Integer> numStack = new Stack<>();
        while(!hou.isEmpty()){
            if(hou.peek()>='0'&&hou.peek()<='9'){
                numStack.push(Integer.parseInt(hou.poll().toString()));
            } else {
                int b = numStack.pop();
                int a = numStack.pop();
                switch (hou.poll()){
                    case '+': numStack.push(a+b); break;
                    case '-': numStack.push(a-b); break;
                    case '*': numStack.push(a*b); break;
                    case '/': numStack.push(a/b); break;
                }
            }
            System.out.println(numStack);
        }
        return numStack.pop();
    }

}
