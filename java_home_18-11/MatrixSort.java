import java.util.Arrays;

public class MatrixSort {
    public static void main(String[] args) {
        System.out.println("Abhi kumar"+"\n");
        int[][] mat = {
            {5, 4, 7},
            {1, 3, 8},
            {2, 9, 6}
        };
        
        int rows = mat.length;
        int cols = mat[0].length;
        int[] temp = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[index++] = mat[i][j];
            }
        }

        Arrays.sort(temp);

        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = temp[index++];
            }
        }

        System.out.println("Sorted Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
      }
    }
}
