

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Somthing");
    }
    public void pritColor(){
        System.out.println(this.color);
    }  
    public void prittype(){
        System.out.println(this.type);
    }    
}
public class Day1_01 {
    public static void main(String[] args) { 
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.pritColor();
        pen2.pritColor();

        pen1.prittype();
        pen2.prittype();

        pen1.write();
        
    }
}   

