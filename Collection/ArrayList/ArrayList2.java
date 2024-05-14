


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList al= new ArrayList<>();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
       

        // add all the elements/ objects in a single go
        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);

        System.out.println(al_dup); //[A, B, C, X, Y, Z]

        // removing all the elements / objects
        al_dup.removeAll(al);
        System.out.println( "After removing " + al_dup); // []

        // Sort ---- Collections.sort()
        System.out.println("Elements in the arrayList" + al);
        Collections.sort(al); // ascending order
        System.out.println("Elements in the AL after sorting " + al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the AL after sorting in reverse order "  + al);

        // shuffling --- Collections.shuffle()
        Collections.shuffle(al); 
        System.out.println("Elements in the AL after shuffling " + al);

        
    }
}
