public class T3 {
    public static void main(String[] args) {
        t3 i = new t3(25);
    }
}

class t3{
    private int i;

    public  t3(){}

    public t3(int i){
        t3 G=new t3();
        G.setI(i);
        G.getI();
        System.out.println(i);
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
