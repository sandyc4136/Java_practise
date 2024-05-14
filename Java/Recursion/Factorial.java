

public class Factorial {
    public static int fact(int x){
        if(x<=1) return 1;
        else return x*fact(x-1);
    }
    public static void main(String[] args) {
        int n=-5;
        System.out.println("factorial of " + n + " " + fact(n));
    }
}
