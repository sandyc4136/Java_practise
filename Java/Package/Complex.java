

 class Program {
    public String toString() {
      return "Complex.toString( )";
  } }

 public class Complex{
    public static void main(String[] args) {
        int arr[]=new int[3];
        for(int element : arr){
         System.out.println(arr);
        }
        
        Program c= new Program();
        String s =c.toString();
        System.out.println(s);
    }
  }