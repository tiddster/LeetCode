public class T2 {
    public static void main(String[] arg){
        Person human = new Person("Tiddster",18);
        System.out.println("Name:"+human.getName());
        System.out.println("Age:"+human.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}