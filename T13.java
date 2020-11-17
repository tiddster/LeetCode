public class T13 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        bike.start();bike.stop();
        bus.start();bus.stop();
    }
}

interface VVehicles{
    void start();
    void stop();
}

class Bike implements VVehicles{
    public void start(){
        System.out.println("Bike started");
    }
    public void stop(){
        System.out.println("Bike stopped");
    }
}

class Bus implements VVehicles{
    public void start(){
        System.out.println("Bus started");
    }
    public void stop(){
        System.out.println("Bus stopped");
    }
}