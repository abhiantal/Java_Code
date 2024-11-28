interface Animal{
    int eye = 2;
    void walk();
}
interface Herbivore{

}
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Animal1{
    static String eyes;
    public static void changeeyes(){
        eyes = "4";
    }

    }
public class Day3_03 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Animal1.eyes = "2";
        System.out.println(Animal1.eyes);
    }
    
}
