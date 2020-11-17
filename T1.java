import java.util.Scanner;

public class T1 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        number result = new number(a,b);
        System.out.println("Addtion:"+result.add());
        System.out.println("Subtration:"+result.sub());
        System.out.println("Multiplicantion:"+result.mul());
        System.out.println("Division:"+result.div());
    }
}

class number{
    private int n1,n2;

    public number(int x,int y){
        n1 = x;
        n2 = y;
    }

    public int add(){
        int x = n1 + n2;
        return x;
    }

    public int sub(){
        int x = n1 - n2;
        return x;
    }

    public int mul(){
        int x = n1 * n2;
        return x;
    }

    public int div(){
        int x = n1 / n2;
        return x;
    }
}

