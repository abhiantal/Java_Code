import java.util.*;

public class day3_String_Builder {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // String name1 = sc.nextLine();  // use for lines
        // String name2 = sc.next();      // use for wards
        // System.out.println(name1);
        // System.out.println(name2);

        // String concatenation = name1+" "+name2;
        // System.out.println(concatenation+"\n");
        // System.out.println(concatenation.length()+"\n");

        // for(int i=0; i<concatenation.length(); i++){
        //     System.out.println(concatenation.charAt(i));
        // }


        // String a = "Abhi";
        // String b = "Abhi";
        // if(a.compareTo(b)==0){
        //     System.out.println("String are equal:");
        // }else{
        //     System.out.println("String are not equal:");
        // }

        // String sent = "My name is Abhi kumar";
        // String sub1 = sent.substring(0, sent.length());
        // String sub2 = sent.substring(11);
        // String sub3 = sent.substring(11, 15);
        // System.out.println(sub1);
        // System.out.println(sub2);
        // System.out.println(sub3);

        StringBuilder sb = new StringBuilder("Abhi kumar");
        System.out.println(sb);

        System.out.println(sb.charAt(6));

        // sb.setCharAt(1, "A");
        // System.out.println(sb);

        sb.insert(5,"-");
        System.out.println(sb);

        sb.delete(5, 6);
        System.out.println(sb);

        sb.append(" ");
        sb.append("A");
        sb.append("n");
        sb.append("t");
        sb.append("a");
        sb.append("l");
        System.out.println(sb);
        System.out.println(sb.length());

        for(int i=0; i<sb.length()/2; i++){
            int frant = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(frant);
            char backChar = sb.charAt(back);

            sb.setCharAt(frant, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
