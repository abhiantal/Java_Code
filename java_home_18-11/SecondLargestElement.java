public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println("Abhi kumar"+"\n"); 
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
            if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
