import java.util.*;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber= new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        System.out.println("Hashset : "+ evenNumber); // [2, 4, 6]
        
        HashSet<Integer> Numbers= new HashSet<Integer>();
        Numbers.addAll(evenNumber);
        Numbers.add(10);
        System.out.println(Numbers);

        // removeAll()
        Numbers.removeAll(evenNumber);
        System.out.println(Numbers);

        
    }   
}
