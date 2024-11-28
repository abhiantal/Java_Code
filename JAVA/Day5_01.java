import java.util.Arrays;

public class Day5_01 {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static int sumArray(int[]arr){
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sum = 0;
        for(int num:arr){
        sum+=num;
        }
    return sum;
    }
    public static void main(String[] args) {
        // int[] numbers = {3, 5, 2, 9, 1};
        // System.out.println("Maximum value: " + findMax(numbers)); // Output: Maximum value: 9

        // int[] number = {1, 2, 3, 4, 5};
        // System.out.println("Sum of elements: " + sumArray(number));

        // int z[]={1,2,3,4,5,6,7,8,9}; 
        // int x[] = Arrays.copyOf(z, z.length);
        // System.out.println("Original: "+Arrays.toString(z));
        // System.out.println("Copy: "+Arrays.toString(x));

        String Org[] = {"abhi", "kumar", "antral"};
        String cop[] = new String[Org.length];
        for(int i =0; i<Org.length; i++){
            cop[i]=Org[i];
        }
        System.out.println(Arrays.toString(cop));
    }
}
