

// public class Fibonacci {
//     public static int fibonacciRec(int n){
//         if(n<=1) return n;
//         else 
//         return fibonacciRec(n-1) + fibonacciRec(n-2);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             System.out.println(fibonacciRec(i) + " ");
//         }
//     }
// }


public class Fibonacci{
    public static int fibonacciRec(int x){
        if(x<=1){
            return x;
        }
        return fibonacciRec(x-1) + fibonacciRec(x-2);
    }
    public static void main(String args[]) {
        int n=6;
        for(int i=0;i<n;i++)
        System.out.print(fibonacciRec(i) + " ");
    }
    
}
