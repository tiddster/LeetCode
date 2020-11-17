public class T12 {
    public static void main(String[] args) {
        CCCar car = new CCCar();
        Moto moto = new Moto();
        car.NoOfwheels();
        moto.NoOfwheels();
    }
}

abstract class Vehicle{
    public int NoOfwheels(int a){
        System.out.println(a+"wheels");
        return a;
    }
}

class CCCar extends Vehicle{
    public int NoOfwheels() {
        return super.NoOfwheels(4);
    }
}

class Moto extends Vehicle{
    public int NoOfwheels() {
        return super.NoOfwheels(2);
    }
}