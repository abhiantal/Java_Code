// import java.util.*;

// public class arrayprac{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter: ");
//         int size =sc.nextInt();
//         int numbers[]=new int[size];

//         for (int i=0; i<size ;i++) {
//             numbers[i]=sc.nextInt();
//         }
//         // print the numbers in arrays
//         for (int i=0;i<numbers.length;i++){

//             System.out.println(numbers[i]);
//         }
//         sc.close();
//     }
// }

 import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print the numbers in the array
        System.out.println("The numbers in the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Close the Scanner
        sc.close();
    }
}
