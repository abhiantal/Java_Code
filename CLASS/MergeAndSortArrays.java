
import java.util.Arrays;
public class MergeAndSortArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int b[] = {9, 8, 7, 6, 5, 4, 3};

        int m = a.length;
        int n = b.length;
        int c[] = new int[m + n];

        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < n; i++) {
            c[i + m] = b[i];
        }

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}
