import java.util.*;
public class day1_02 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("you are adult:");
        }else{
            System.out.println("you are not adult:");
        }


        int no = sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("Even");
                break;
            case 2:
                System.out.println("odd");
                break;
            default:
                System.out.println("increct");
                break;
        }


        int no4 = sc.nextInt();
        while (no4<10) {
            System.out.println("yes");
            break;
        }

        do{
            System.out.println("no");
            break;
        }
        while(no4<10);

    }
    
}
