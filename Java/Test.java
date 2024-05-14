 class Program1{
    private int num1;
    private int num2;
    public static int num3;
    //Static initialization block
    static {
      num3 = 500;
    }
    
    // Test.num3=6;
    public Program1( int num1, int num2 ){
      this.num1 = num1;
      this.num2 = num2;
    }
    public void display(){
        System.out.println(num1 + " " + num2 + " " + num3);
    }
  } 
    
  public class Test{
    public static void main(String[] args) {
        Program1 t1=new Program1(10, 20);
        t1.display();
        System.out.println(Program1.num3);
    }
}