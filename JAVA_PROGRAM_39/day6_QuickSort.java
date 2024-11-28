public class day6_QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivet  = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivet){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivet;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivetIndx = partition(arr, low, high);
            quickSort(arr, low, pivetIndx-1);
            quickSort(arr, pivetIndx+1, high);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,4,9,3,7,2,985,59,455,90};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
