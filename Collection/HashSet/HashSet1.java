import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        
        // ways to create a hashSet
        HashSet hs = new HashSet();  // initial capacity =16, load facote=.75
        // HashSet hs1=new HashSet(100); // initial capacity =100
        // HashSet hs2=new HashSet<>(100, (float)0.90);
        // HashSet<Integer> hs3= new HashSet<Integer>();

        // Add Objects/ emelents into HashSet
        hs.add(100);
        hs.add("Welcome");
        hs.add(15.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs); // [null, A, 100, Welcome, 15.5, true]

        // remove()
        hs.remove(15.5); // value
        System.out.println("After removing element " + hs);
   
        // contains()
        System.out.println(hs.contains("Welcome")); // true
        System.out.println(hs.contains("xyz")); // false

        System.out.println(hs.isEmpty()); // false

        // Reading objects/elements from hashset using 
        // 1. for..each loop

        // for(Object e :hs){
        //     System.out.println(e);
        // }

        // 2. Using Iterator()
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
  