public class T4 {
    public static void main(String[] args) {
        WuMingFen test = new WuMingFen("suanlafen",2,true);
        test.check();
    }
}

class WuMingFen{
    private String theMa;
    private int quantity;
    private boolean likesoap;

    public WuMingFen(String theMa,int quantity,boolean likesoap){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likesoap = likesoap;
    }

    public  WuMingFen(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public void check(){
        if (likesoap == true)
            System.out.println(theMa+"  "+quantity+"liang"+"  "+"with soap");
        else
            System.out.println(theMa+"  "+quantity+"liang"+"   "+"without soap");
    }
}