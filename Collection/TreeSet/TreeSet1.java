import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>();
        // t.add("A");
        // t.add("a");
        // t.add("B");
        // t.add("Z");
        // t.add("L");

        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));

        // t.add(10); // ClassCastException
         // t.add(null); // NullPointerException
        System.out.println(t); // [A, B, L, Z, a]
    }
}

// import java.util.TreeSet;

// public class TreeSet1 {
//     public static void main(String[] args) {
//         TreeSet<String> treeSet = new TreeSet<>();
//         treeSet.add(null);

//         System.out.println(treeSet); // Output: [null]
//     }
// }

