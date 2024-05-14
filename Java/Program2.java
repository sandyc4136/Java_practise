// class Complex{
//     private int real;
//     private int imag;
//     public Complex( ){
//       System.out.println("Inside constructor.");
//       this.real = 10;
//       this.imag = 20;
//     }
//     public static void test( ){
//       Complex c2 = new Complex(); //OK
//       System.out.println();
//     }
//   }
//   class Program2{
//     public static void main(String[] args) {
//       Complex c1 = new Complex(); //OK
//       c1.test();
//     } }

class Complex{
    private int real;
    private int imag;
    private Complex( ){
      System.out.println("Inside constructor.");
      this.real = 10;
      this.imag = 20;
    }
    public static void test( ){
      Complex c2 = new Complex(); //OK
    System.out.println(c2.real);
    }
    
  }
class Program2{
  public static void main(String[] args) {
    //Complex c1 = new Complex(); //NOT OK
     Complex.test();
   
} }