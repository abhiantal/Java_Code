import java.util.HashSet;

public class day4_Recursion_2 {

    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if (n==1) {
    //         System.out.println("transfer disk "+n+" from "+src+" to "+ dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk "+n+" from "+src+" to "+ dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }

    // public static void printRev(String str, int indx) {
    //     if (indx==0) {
    //         System.out.println(str.charAt(indx));
    //         return;
    //     }
    //     System.out.println(str.charAt(indx));
    //     printRev(str, indx-1);
    // }

    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurance(String str, int indx, char element) {
    //     if (indx==str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char current = str.charAt(indx);
    //     if (current == element) {
    //         if (first == -1) {
    //             first = indx;
    //         }else{
    //             last = indx;
    //         } 
    //     }
    //     findOccurance(str, indx-1, element);
    // }

    // public static boolean isSorted(int arr[], int indx) {
    //     if(indx == arr.length-1){
    //         return true;
    //     }
        // if (arr[indx] <= arr[indx+1]) {
        //     return isSorted(arr, indx+1);
        // }else{
        //     return false;
        // }

    //     if (arr[indx] >= arr[indx+1]) {
    //         return false;
    //     }else{
    //         return isSorted(arr, indx+1);
    //     }
    // }

    // public static void moveAllChar(String str, int indx, int count, String newString){
    //     if (indx == str.length()) {
    //         for(int i=0; i<count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char current = str.charAt(indx);
    //     if (current == 'x') {
    //         count++;
    //         moveAllChar(str, indx+1, count, newString);
    //     }else{
    //         newString += current;
    //         moveAllChar(str, indx+1, count, newString);;
    //     }
    // }

    // public static boolean[] map = new boolean[26];
    // public static void RemoveDuplicates(String str, int indx, String newString){
    //     if (indx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char  curent = str.charAt(indx);
    //     if (map[curent - 'a'] == true) {
    //         RemoveDuplicates(str, indx+1, newString);
    //     }else{
    //         newString += curent;
    //         map[curent - 'a'] = true;
    //         RemoveDuplicates(str, indx+1, newString);
    //     }
    // }

    // public static void subSequences(String str, int indx, String newString){
    //     if (indx == str.length()) {
    //         System.out.print(newString+","+"  ");
    //         return;
    //     }
    //     char curent = str.charAt(indx);
    //     subSequences(str, indx+1, newString+curent);
    //     subSequences(str, indx+1, newString+"_");
    // }

    // public static void subSequences_HashSet(String str, int indx, String newString, HashSet<String>set){
    //     if (indx == str.length()) {
    //         if (set.contains(newString)) {
    //             return;
    //         }else{
    //             System.out.print(newString+","+"  ");
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char curent = str.charAt(indx);
    //     subSequences_HashSet(str, indx+1, newString+curent,set);
    //     subSequences_HashSet(str, indx+1, newString, set);
    // }

    // public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    // public static void printCombnation(String str, int indx, String Combination){
    //     if (indx == str.length()) {
    //         System.out.print(Combination+","+" ");
    //         return;
    //     }
    //     char current = str.charAt(indx);
    //     String mapping = keypad[current - '0'];
    //     for(int i=0; i<mapping.length(); i++){
    //         printCombnation(str, indx+1, Combination+mapping.charAt(i));
    //     }
    // }


    public static void main(String[] args) {
        
        //towerOfHanoi(3, "S", "H", "D");

        // String name = "Abhi";
        // printRev(name, name.length()-1);

        // String name1 = "assjv";
        // findOccurance(name1,  0,  "a");

        // int Array[] = {1,2,3,5,4};
        // System.out.println(isSorted(Array, 0));

        // String name2 = "axdddxkjcksdxix";
        // moveAllChar(name2, 0, 0, "");

        // String name3 = "axdddxkjcksdxix";
        // RemoveDuplicates(name3, 0, "");

        // String name4 = "ABCD";
        // subSequences(name4, 0, "");

        // String name4 = "AAA";
        // HashSet<String>set = new HashSet<>();
        // subSequences_HashSet(name4, 0, "", set);

        // String str = "111";
        // printCombnation(str, 0, "");
    }
}
