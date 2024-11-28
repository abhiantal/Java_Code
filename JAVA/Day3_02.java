//abstraction

abstract class Animal{
    abstract void walk();
    //public void walk(){}
    Animal(){
        System.out.println("you are creating a new animal Constructer:");
    }
    public void eat(){
        System.out.println("Animal Eats:");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Creating a horse Constructer:");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Day3_02 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        // animal animal1 = new animal();
        // animal1.walk();
    }
    
}
