//Inheritance


class Shape{
    // int l = 0;
    // int h = 0;
    // int r = 0;

    public void Area(){
        System.out.println("Displays Area:");
    }
}
class Trirangle extends Shape{
    public void Area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilaterTriangle extends Trirangle{
    public void Area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void Area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Day2_01 {
    public static void main(String[] args) {
        Shape t0 = new Shape();
        t0.Area();

        Trirangle t1 = new Trirangle();
        t1.Area(3,5);

        EquilaterTriangle t2 = new EquilaterTriangle();
        t2.Area(8,9);

        Circle t3 = new Circle();
        t3.Area(4);


    }
    
}
