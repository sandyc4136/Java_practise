import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime) System.out.println("prime");
        else System.out.println("Non Prime");
    }
}
