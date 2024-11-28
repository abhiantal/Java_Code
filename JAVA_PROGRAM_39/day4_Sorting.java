public class day4_Sorting {

    public static void printArray(int Array[]) {
        for(int i=0; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();   
    }
    public static void main(String[] args) {

        int Arr[] = {7,43,623,789,23,87,56,4343,656};

// Bubble sort,  timeComplexity = O(n^2)
        // for(int i=0; i<Arr.length-1; i++){
        //     for(int j=0; j<Arr.length-i-1; j++){

        //         if (Arr[j] > Arr[j+1]){
        //             int temp = Arr[j];
        //             Arr[j]=Arr[j+1];
        //             Arr[j+1] = temp;
        //         }
        //     }
        // }
        //printArray(Arr);

// selection sort,  timeComplexity = O(n^2)
        // for(int i=0; i<Arr.length-1; i++){
        //     int smallest=i;
        //     for(int j=i+1; j<Arr.length; j++){
        //         if(Arr[smallest]>Arr[j]){
        //             smallest=j;
        //         }
        //     }
        //     int temp1 = Arr[smallest];
        //     Arr[smallest] = Arr[i];
        //     Arr[i] = temp1;
        // }
        // printArray(Arr);

// Insertion sort,   timeComplexity = O(n^2)
        for(int i=0; i<Arr.length; i++){
            int current = Arr[i];
            int j = i-1;
            while (j>=0 && current<Arr[j]) {
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = current;
        }
        printArray(Arr);
    }
}
