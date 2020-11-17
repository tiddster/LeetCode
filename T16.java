public class T16 {
    public static void main(String[] args) {
        purewater1 pw1 = new purewater1();
        purewater2 pw2 = new purewater2();
        purewater3 pw3 = new purewater3();
        pw1.guolv();pw1.huanchong();
        pw2.guolv();
        pw3.huanchong();
    }
}

abstract class water{
    public water(){}
}

interface guolv{
    void guolv();
}

interface huanchong{
    void huanchong();
}

interface heat{
    void heat();
}

interface addSugar{
    void addSuger();
}

class purewater1 extends water implements guolv,huanchong {
    public void guolv() {
        System.out.println("w1 has (guo lv)ed");
    }
    public void huanchong() {
        System.out.println("w1 has (huan chong)ed");
    }
}

class purewater2 extends water implements  guolv{
    public void guolv() {
        System.out.println("w2 has (guo lv)ed");
    }
}

class purewater3 extends water implements huanchong{
    public void huanchong() {
        System.out.println("w3 has (huan chong)ed");
    }
}