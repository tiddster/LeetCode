public class T9 {
    public static void main(String[] args) {
        t9 test1 = new t9(8,9);
        System.out.println(test1.max());
        t9 test2 = new t9(10,25,34);
        System.out.println(test2.getMul());
        t9 test3 = new t9("Monster","Tiddler");
        test3.check();
    }
}

class t9{
    private int a,b;
    private double i,j,k;
    private String n1,n2;

    public  t9(String n1,String n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public t9(int a,int b){
        this.a = a;
        this.b = b;
    }

    public t9(double i,double j,double k){
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public int max(){
        if(a>b)
            return a;
        else
            return b;
    }

    public double getMul(){
        double m = j*i*k;
        return m;
    }

    public void check(){
        if(n1.equals(n2))
            System.out.println("They are same");
        else
            System.out.println("They are not same");
    }
}