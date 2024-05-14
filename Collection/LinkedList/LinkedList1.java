

import java.util.*;

 class LinkedList1 {
    public static void main(String[] args) {
        
        // Declare LinkedList
        LinkedList ll=new LinkedList<>(); // Heterogenous Data
        // LinkedList<Integer> LL=new LinkedList<Integer>(); // Homogeneous data
        // LinkedList<String> LL=new LinkedList<String>();// Homogeneous data

        // Add elements into LinkedList
        ll.add(100);
        ll.add("Welcome");
        ll.add(14.4);
        ll.add('A');
        ll.add(true);
        ll.add(null);

        System.out.println(ll); // [100, Welcome, 14.4, A, true, null]
        System.out.println(ll.size()); // 6

        // Remove
        ll.remove(3);
        System.out.println("After removing, new List  : " + ll); // [100, Welcome, 14.4, true, null]

        // Adding/ inserting element in the middle of LL
        ll.add(3,"Java");
        System.out.println("After inseriting element , new List  : " + ll);

        // retrieving data
        System.out.println(ll.get(3)); // Java

        // changing the value
        ll.set(5, "X");
        System.out.println("After changing element , new List  : " + ll);

        // contains()
        System.out.println(ll.contains("Java")); // true
        System.out.println(ll.contains("Python")); // false

        // isEmpty()
        System.out.println(ll.isEmpty());  //false

        // Read the elements in LL 

        // 1. Loop
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        } 

        // 2. for each 
        for(Object e:ll){
            System.out.println(e);
        }

        // 3. Iterator()
        Iterator it=ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    } 
}
