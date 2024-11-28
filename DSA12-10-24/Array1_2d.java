import java.util.Scanner;

public class Array1_2d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of matrix: ");
        int a = sc.nextInt();
        System.out.print("Enter the colum of matrix: ");
        int b = sc.nextInt();
        int m[][] = new int[a][b];
        System.out.println("Enter the value of matrix:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("value of matrix:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
