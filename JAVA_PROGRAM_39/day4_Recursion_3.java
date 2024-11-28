import java.util.ArrayList;

public class day4_Recursion_3 {

    // public static void Permutations(String str, String Permutations) {
    //     if(str.length() == 0){
    //     System.out.print(Permutations+","+" ");
    //     return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char current = str.charAt(i);
    //         String newString = str.substring(0, i) + str.substring(i+1);
    //         Permutations(newString, Permutations+current);
    //     }
    // }

    // public static int CountPaths(int i, int j, int n, int m) {
    //     if(i == n && j == m){
    //         return 0;
    //     }else if (i == n-1 && j == m-1) {
    //         return 1;
    //     }
    //     int downPaths = CountPaths(i+1, j, n, m);
    //     int rightPaths = CountPaths(i, j+1, n, m);
    //     return downPaths + rightPaths;
    // }

    // public static int placeTiles(int n, int m) {
    //     if(n == m){
    //         return 2;
    //     }else if (n<m) {
    //         return 1;
    //     }
    //     int vertPlace = placeTiles(n-m, m);
    //     int horyplace = placeTiles(n-1, m);
    //     return vertPlace + horyplace;
    // }

    // public static int callGuests(int n) {
    //     if(n <= 1){
    //         return 1;
    //     }
    //     int ways1 = callGuests(n-1);
    //     int ways2 = callGuests(n-2) * (n-1);
    //     return ways1 + ways2;
    // }

    public static void printSubset(ArrayList<Integer>subset) {
        for(int i=-0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer>subset) {
        if(n == 0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        //Permutations("123", "");

        // int totalPaths = CountPaths(0, 0, 4, 5);
        // System.out.println(totalPaths);
        // System.out.println(CountPaths(0,0,3,3));
        
        //System.out.println(placeTiles(4, 2));

        //System.out.println(callGuests(4));

        ArrayList<Integer>subset = new ArrayList<>();
        findSubsets(3, subset);
    }
}
