package NullPointer;

public class NullP {
    public static void main(String[] args) {
        A a=new A();
        a.sum();
    }
    public static class A{
        public void sum(){
            System.out.println("Sum ");
        }
    }
}
