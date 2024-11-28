import java.util.Arrays;
public class Day5_03l {

//What happens when you pass an array to a method? Does the method
// get a copy of the array or a reference to the original?
    //public class ArrayPassExample {
        // Method that modifies the array

        // public static void modifyArray(int[] arr) {
        //     for (int i = 0; i < arr.length; i++) {
        //         arr[i] *= 2; // Double each element
        //     }
        // }
        // public static void main(String[] args) {
        //     int[] numbers = {1, 2, 3, 4, 5};
    
        //     System.out.println("Original array before modification: ");
        //     for (int num : numbers) {
        //         System.out.print(num + " "); // Output: 1 2 3 4 5
        //     }
        //     System.out.println();
    
        //     // Pass the array to the method
        //     modifyArray(numbers);
    
        //     System.out.println("Original array after modification: ");
        //     for (int num : numbers) {
        //         System.out.print(num + " "); // Output: 2 4 6 8 10
        //     }
        // }
    

// get a copy of the array or a reference to the original?
    //public class ArrayManipulations {
        // Method to reverse an array

        // public static void reverseArray(int[] array) {
        //     int left = 0;
        //     int right = array.length - 1;
    
        //     while (left < right) {
        //         // Swap the elements
        //         int temp = array[left];
        //         array[left] = array[right];
        //         array[right] = temp;
    
        //         // Move towards the middle
        //         left++;
        //         right--;
        //     }
        // }
        // public static void main(String[] args) {
        //     int[] numbers = {1, 2, 3, 4, 5};
    
        //     System.out.println("Original array: ");
        //     printArray(numbers); // Output: 1 2 3 4 5
    
        //     reverseArray(numbers);
    
        //     System.out.println("Reversed array: ");
        //     printArray(numbers); // Output: 5 4 3 2 1
        // }
    
        // // Helper method to print the array
        // public static void printArray(int[] array) {
        //     for (int num : array) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
    
//Here’s a method to remove duplicate elements from an array:
//public class ArrayManipulations {
    // Method to remove duplicates

    // public static int[] removeDuplicates(int[] array) {
    //     return Arrays.stream(array)
    //                  .distinct() // Remove duplicates
    //                  .toArray(); // Convert back to array
    // }
    // public static void main(String[] args) {
    //     int[] numbers = {1, 2, 2, 3, 4, 4, 5};

    //     System.out.println("Original array: ");
    //     printArray(numbers); // Output: 1 2 2 3 4 4 5

    //     int[] uniqueNumbers = removeDuplicates(numbers);

    //     System.out.println("Array after removing duplicates: ");
    //     printArray(uniqueNumbers); // Output: 1 2 3 4 5
    // }

    // // Helper method to print the array
    // public static void printArray(int[] array) {
    //     for (int num : array) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }

//Here’s a method that merges two arrays into a single array:
//public class ArrayManipulations {
    // Method to merge two arrays

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Array 1: ");
        printArray(array1); // Output: 1 2 3
        System.out.println("Array 2: ");
        printArray(array2); // Output: 4 5 6

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged array: ");
        printArray(mergedArray); // Output: 1 2 3 4 5 6
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
