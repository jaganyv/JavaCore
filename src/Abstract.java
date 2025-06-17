abstract class Vehicle{
    abstract void speed();
    void brand(){
        System.out.println("BMW");
    }
}
class Car extends Vehicle{
    void speed(){
        System.out.println("100K/h");
    }
    void brand(){
        super.brand();
    }
}
class Bike extends Car{
    @Override
    void speed() {
        System.out.println("200K/H");
    }
    void brand(){
        System.out.println("MotorBike");
    }
}
class Lorry extends Vehicle{
    void speed(){
        System.out.println("I am Lorry");
    }
}
public class Abstract {
    public static void main(String[] args){
        Bike obj1 = new Bike();
        obj1.brand();
        obj1.speed();
        Car obj2 = new Car();
        obj2.brand();
        obj2.speed();
        Lorry obj3 = new Lorry();
        obj3.speed();
    }
}
