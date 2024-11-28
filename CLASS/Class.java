import java.lang.reflect.Array;
import java.util.Arrays;

public class Class {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8};
        int b[]={9,8,7,6,5,4,3};
        int m = a.length;
        int n = b.length;
        int c[] = new int[m+n];
        for(int i =0; i<m; i++){
            c[i]=a[i];
        }
        for(int i=0; i<n; i++){
            c[i+m]=b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));


//         int a[]={1,2,3,4,5,6,7,8};
//         int b[]={9,8,7,6,5,4,3};

//         Arrays.sort(b);
//         int m = a.length;
//         int n = b.length;
//         int c[] = new int[m+n];

//         int i=0;
//         int j=0;
//         int k=0;

//         while (i<m && j<n) {
//             if(a[i]<b[i]){
//                 c[k]=a[i];
//                 i++; 
//             }
//             else{
//                 c[k]=b[j];
//                 j++; 
//             }
//             k++;
//         }
//         while (i<m) {
//             c[k]=a[i];
//             i++; k++;  
//         }
//         while (j<n) {
//             c[k]=b[j];
//             j++; k++;  
//         } 
//         System.out.println(Arrays.toString(c));   
//     }
    }  
 }
