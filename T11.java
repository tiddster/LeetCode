public class T11 {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.speeddown();a.speedup();a.stop();
        Auto b = new CCar();
        b.speedup();b.speeddown();b.stop();
        CCar c = new CCar();
        c.speedup();c.speeddown();c.stop();
    }
}

class Auto{
    private int luntai;
    private String color;
    private double kg;
    private double speed;
    public Auto(){}

    public void speedup(){
        System.out.println("Speeding up");
    }
    public void speeddown(){
        System.out.println("Speeding down");
    }
    public void stop(){
        System.out.println("Stopped");
    }
}

class CCar extends Auto{
    private String air;
    private String CD;
    public CCar(){}
    public void speedup() {
        System.out.println("I am car,I'm speeding up");
    }
    public void speeddown() {
        System.out.println("I'm car,I'm speeding up");
    }
}