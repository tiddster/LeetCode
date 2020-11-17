import static java.lang.System.*;

public class T8 {
    public static void main(String[] args) {
        car Tesla = new car(4,"silver",1000);
        Tesla.speedup();
        Tesla.speeddown();
        Tesla.stop();
    }
}

class car{
    private int lun;
    private String color;
    private int weight;
    public car(int lun,String color,int weight){
        this.lun = lun;
        this.color = color;
        this.weight = weight;
    }

    public void speedup(){
        out.println("Speeding up");
    }

    public void speeddown(){
        out.println("Speeding down");
    }

    public void stop(){
        out.println("Stopped");
    }
}