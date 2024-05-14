import java.util.*;

public class Get_and_Set_Array {
    static Scanner sc = new Scanner(System.in);
    private static void acceptRecord(int[] arr) {
      if( arr != null ) {
        for( int index = 0; index < arr.length; ++ index ) {
          System.out.print("Enter element :   ");
          arr[ index ] = sc.nextInt();
        }
  } }
    private static void printRecord(int[] arr) {
      if( arr != null ) {
        for( int index = 0; index < arr.length; ++ index )
          System.out.print( arr[ index ]+"    ");
  }
      System.out.println();
    }
    public static void main(String[] args) {
      //int[] arr = null;
      int[] arr = new int[ 3 ];
      Get_and_Set_Array.acceptRecord( arr );
      Get_and_Set_Array.printRecord(arr);
    }
  }