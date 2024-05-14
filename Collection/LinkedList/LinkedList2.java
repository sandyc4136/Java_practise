import java.util.*;

public class LinkedList2 {
   public static void main(String[] args) {
    LinkedList l=new LinkedList<>();

    l.add("X");
    
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList new_l=new LinkedList<>();
        new_l.addAll(l);
        System.out.println(new_l); //[X, Y, Z, A, B, C]

        new_l.add("AA");
        // remove all
        new_l.removeAll(l);
        System.out.println("new List after remove All " + new_l);


        // Sort ---- Collections.sort()
        System.out.println("Elements in the LinkedList" + l);
        Collections.sort(l); // ascending order
        System.out.println("Elements in the LL after sorting " + l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Elements in the LL after sorting in reverse order "  + l);

        // shuffling --- Collections.shuffle()
        Collections.shuffle(l); 
        System.out.println("Elements in the AL after shuffling " + l);
   } 
}
