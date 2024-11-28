import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        System.out.println("Enter the valu of array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index of new value");
        int p=sc.nextInt();
        System.out.println("Enter the new value of array");
        int m=sc.nextInt();
        for(int i=0; i<b.length; i++){
            if (i<p) {
                b[i]=a[i];
            }
            else if (i==p) {
               b[i]=m;
            }
            else{
                b[i]=a[i-1];
            }
         }
        System.out.println("Elemant of array are");
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
    
}
