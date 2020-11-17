public class T15 {
    public static void main(String[] args) {
        Door door = new Door();
        door.bulletproof();
        door.fireproof();
        door.rustproof();
        door.theftproof();
        door.waterproof();
    }
}

interface function1{
    void theftproof();
}

interface function2{
    void waterproof();
}

interface function3{
    void bulletproof();
}

interface function4{
    void fireproof();
}

interface function5{
    void rustproof();
}

class Door implements function1,function2,function3,function4,function5{
    public void theftproof() {
        System.out.println("This door is theftproof");
    }

    public void bulletproof() {
        System.out.println("This door is bulletproof");
    }

    public void fireproof() {
        System.out.println("This door is fireproof");
    }

    public void rustproof() {
        System.out.println("This door is rustproof");
    }

    public void waterproof() {
        System.out.println("This door is waterproof");
    }

    public void open(){}
    public void close(){}
}