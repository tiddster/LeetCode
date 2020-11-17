public class T5 {
    public static void main(String[] args) {
        Vehicles a = new Vehicles("Tesla","Silver");
        a.showInof();
        a.run();
        Car b = new Car(4,"Tesla","Silver");
        b.showCar();
        Truck c = new Truck(20,"SGMW","White");
        c.showTruck();
    }
}

class Vehicles{
    public String brand;
    public String color;

    public Vehicles(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("I have already started");
    }

    public void showInof(){
        System.out.println(brand+color);
    }
}

class Car extends Vehicles{
    private int seats;

    public Car(int seats,String brand,String color){
        super(brand, color);
        this.seats = seats;
    }

    public void showCar(){
        System.out.println(brand+"  "+color+"  "+seats);
    }
}

class Truck extends Vehicles{
    private float load;

    public Truck(float load,String brand, String color) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck(){
        System.out.println(brand+"  "+color+"  "+load);
    }
}