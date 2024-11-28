public class MoveZeroesToEnd {
    public static void main(String[] args) {
        System.out.println("Abhi kumar"+"\n");
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        moveZeroes(arr);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int index = 0; // Pointer for placing non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
    }
}
