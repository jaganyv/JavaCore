//Single Inheritance
class Animal{
    void makeSound(){
        System.out.println("Animal Make Sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog is Barking");
    }
}
//Adding Multilevel With Single For Simple Codes
class Puppy extends Dog{
    void makeSound(){
        System.out.println("Puppy Weeps");
    }
}
// Adding Also Heirarchical For Simple Codes
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow Meow");
    }
}
//Hybrid Is Mixed Of All The Above Types That It
public class Inheritance {
    public static void main(String[] args){
        Dog obj1 = new Dog();
        obj1.makeSound();
        Puppy obj2 = new Puppy();
        obj2.makeSound();
        Cat obj3 = new Cat();
        obj3.makeSound();
    }
}
