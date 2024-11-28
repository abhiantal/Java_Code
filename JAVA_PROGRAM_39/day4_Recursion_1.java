public class day4_Recursion_1{

    // public static void printnum0(int n) {
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum0(n-1);
    // }

    // public static void printnum1(int n) {
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum1(n+1);
    // }

    // public static void printSum(int i, int n, int sum) {
    //     if(i==n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }

    // public static int callFactorial(int n) {
    //     if (n==1 || n==0) {
    //         return 1;
    //     }
    //     int fact_n1 = callFactorial(n-1);
    //     int fact_n2 = n*fact_n1;
    //     return fact_n2;
    // }

    // public static void callFibonacci(int a, int b, int c){
    //     if (c==0) {
    //         return;
    //     }
    //     int n = a+b;
    //     System.out.println(n);
    //     callFibonacci(b, n, c-1);
    // }

    // public static int callPower(int x, int n){
    //     if (n==0) {
    //         return 1;
    //     }
    //     if (n==0) {
    //         return 1;
    //     }
    //     int xPower_n1 = callPower(x, n-1);
    //     int xPower_n2 = x*xPower_n1;
    //     return xPower_n2;
    // }

    public static int call_Log_Power(int x, int n){
        if (n==0) {
            return 1;
        }
        if (n==0) {
            return 1;
        }
        // n is even
        if (n % 2 == 0) {
            return call_Log_Power(x, n/2) * call_Log_Power(x, n/2);
        }else{
            return call_Log_Power(x, n/2) * call_Log_Power(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        
        // printnum0(5);

        //printnum1(1);

        //printSum(1, 5, 0);

        // int ans = callFactorial(5);
        // System.out.println(ans);

        // int a = 1;
        // int b = 0;
        // //System.out.println(a);
        // System.out.println(b);
        // callFibonacci(a, b, 7);

        // int ans1 = callPower(2, 5);
        // System.out.println(ans1);

        int ans2 = call_Log_Power(2, 5);
        System.out.println(ans2);

    }
}
