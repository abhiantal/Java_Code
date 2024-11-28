import java.util.*;

public class Day6_01 {

    public static void main(String[] args) {
        // String a = "abhi";
        // int b = a.length();
        // for(int i=b-1; i>-1; i--){
        //     System.out.print(a.charAt(i)+" ");
        // }

//         Scanner sc1 = new Scanner(System.in);
//         System.out.println("Enter the first integer: ");
//         int a = sc1.nextInt();
//         System.out.println("Enter the second integer: ");
//         int b = sc1.nextInt();
//         System.out.println("Enter the number operation operator(1->+; 2->-; 3->*; 4->/)");
//         int c = sc1.nextInt();
// switch (c) {
//     case 1:
//         System.out.println(a+b);
//         break;
//     case 2:
//     System.out.println(a-b);
//         break;
//     case 3:
//     System.out.println(a*b);
//         break;
//     case 4:
//     System.out.println(a/b);
//         break;
// }
// sc1.close();

// Scanner sc2 = new Scanner(System.in);
// System.out.println("Enter the number of fibonacci series:");
// int s = sc2.nextInt();
// int f = 0;
// int c = 1;
// while (f<=s) {
//     System.out.println(f+" ");
//     int next = f+c;
//     f = c;
//     c = next;
// }
// System.out.println();
// sc2.close();

Scanner sc3 = new Scanner(System.in);
System.out.println("enter number up to Factorial: ");
int d = sc3.nextInt();
if(d<0){
    System.out.println("Factorial not posibal for negative number:");
}
else{
    long F = 1;
    for(int i=1; i<=d; i++){
        F *= i;
    }
    System.out.println("Factorial of "+d+" is. "+F);
}
sc3.close();
    }
}