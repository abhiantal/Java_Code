import java.util.Scanner;;

public class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int a = sc.nextInt();
        int b[] = new int[a];
        int c[]  = new int[a-1];
        System.out.println("Enter the value of Array:");
        for(int i=0; i<a; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Enter the index value to be Deleted:");
        int d = sc.nextInt();
        for(int i=0; i<b.length; i++){
            if (i<d) {
                c[i]=b[i];
            }
            else if (i==d) {
                continue;
            }
            else{
                c[i-1]=b[i];
            }
        }
        System.out.println("value of Array:");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
}
