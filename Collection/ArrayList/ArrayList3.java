
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    public static void main(String[] args) {
        
        String arr[]={"Dog", "Cat","Elephant","Monkey"};
        for(String value:arr){
            System.out.println(value);
        }

        // Converting array into arraylist
        ArrayList al= new ArrayList(Arrays.asList(arr)); 
        System.out.println(al);
    }
}

