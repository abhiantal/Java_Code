import java.util.Arrays;
import java.util.Comparator;

public class Day5_02 {

    public static int linearSearch(int[] arr, int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // int a[][];
        // a = new int[3][3];
        // int n[][]=new int[3][3];
        
        // int b[]={8,6,9,3,5,9,6,23,5,90,78};
        // System.out.println("Org: "+Arrays.toString(b));
        // Arrays.sort(b);
        // System.out.println("Short: "+Arrays.toString(b));

    //     int v[][]={
    //         {2,3,4},
    //         {9,6,7},
    //         {8,9,0}
    //     };
    //     System.out.println("Org Array:");
    //     print2D(v);
    //     //System.out.println("Org: "+Arrays.toString(v));

    //     Arrays.sort(v, new Comparator<int[]>() {
    //         public int compare(int row1[], int row2 []){
    //             return Integer.compare(row1[0], row2[0]);
    //         }  
    //     });
    //     System.out.println("Short Array:"+"\n");
    //     print2D(v);
    // }
    // public static void print2D(int[][] Array){
    //     for(int[] row:Array){
    //         System.out.println(Arrays.toString(row));
    //     }

    int num[]={8,6,9,3,5,9,6,23,5,90,78};
    int target = 90;
    int result = linearSearch(num, target);
    if(result !=-1){
        System.out.println("Element found at index: "+result);
    }
    else{
        System.out.println("Element not found in the Array:");
    }
    }
}
