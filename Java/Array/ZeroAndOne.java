import java.util.*;

public class ZeroAndOne {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++)
        //     arr[i]=sc.nextInt();
        // int c1=0,c2=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0)
        //      c1++;
        //     if(arr[i]==1)
        //      c2++;
        // }
        // System.out.println("Count of 0 : " + c1);
        // System.out.println("Count of 1 : " + c2);

        Date[] arr = new Date[ 3 ]; //Array of references
        for( int index = 0; index < arr.length; ++ index )
          arr[ index ] = new Date();
        for( int index = 0; index < arr.length; ++ index )
          System.out.println( arr[ index ]); //OK
    }
}
