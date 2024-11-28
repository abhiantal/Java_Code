import java.util.*;
public class day3_01 {

    // public static void printName(String name) {
    //     System.out.println(name);
    //     return;
    // }
    // public static int printSum(int a, int b) {
    //     System.out.println(a+b);
    //     return a+b;
    // }
    // public static int printProduct(int a, int b) {
    //     System.out.println(a*b);
    //     return a*b;

    public static int printFactorial(int f) {
        if(f<0){
            System.out.print("invalid number: ");
            return f;
        }
        int Fact = 1;
        for(int i=f; i>=1; i--){
            Fact = Fact*i;
        }
        //System.out.println(Fact);
        return Fact;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.next();
        // printName(name);

        // System.out.println("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.println("enter second number: ");
        // int b = sc.nextInt(); 
 
        // printSum(a, b);    // use for sout
        // printProduct(a, b);  // use for sout

        // System.out.println(printProduct(a, b));   // use for return
        // System.out.println(printSum(a, b));       // use for return

        System.out.print("enter the number of factorial: ");
        int f = sc.nextInt();
        //printFactorial(f);
        System.out.println("your factorial is: "+printFactorial(f));
    }
}
