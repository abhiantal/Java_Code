public class day6_MergeSort {

// nlogn
    public static void conquer(int arr[], int str, int mid, int end){
        int merged[] = new int[end - str + 1];
        int indx1 = str;
        int indx2 =  mid+1;
        int x = 0;

// O(n)        
        while (indx1<=mid && indx2<=end ) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x] = arr [indx1];
                x++; indx1++;
            }else{
                merged[x] = arr[indx2];
                x++; indx2++;
            }
        }
        while (indx1 <= mid) {
            merged[x] = arr[indx1+1];
            x++; indx1++;
        }
        while (indx2 <= end) {
            merged[x] = arr[indx2+1];
            x++; indx2++;
        }
        for(int i=0, j=str; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int str, int end){
        if(str >= end){
            return;
        }
// O(n)
        int mid = str+(end-str)/2;
        divide(arr, str, mid);
        divide(arr, mid+1, end);
        conquer(arr, str, mid, end);
    }
    public static void main(String[] args) {
        
        int arr[] = {2,2,7,4,9,2};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
