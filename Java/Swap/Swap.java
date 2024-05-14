import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int x=2,y=11;
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swapping : ");
        
        System.out.println("x :" + x );
        System.out.println("y :" + y);
        // x=x+y;
        // y=x-y;
        // x=x-y;

        x=x*y;
        y=x/y;
        x=x/y;

        System.out.println("After Swapping : ");
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }
}
