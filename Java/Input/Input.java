import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("x : " + x);

        String i = sc.next();
        String j = sc.next();

        BigInteger Bi = new BigInteger(i);
        BigInteger Bj = new BigInteger(j); // Corrected from i to j
        BigInteger sum = Bi.add(Bj);
        System.out.println(sum);
    }
}
