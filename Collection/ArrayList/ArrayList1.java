

import java.util.*;
import java.util.ArrayList;
import java.util.List;



public class ArrayList1 {

    public static void main(String[] args) {

        // different ways to declare ArrayList
        //ArrayList al=new ArrayList();
        //ArrayList al1=new ArrayList<>();
        //ArrayList<Integer> a1l=new ArrayList<Integer>();
        //ArrayList<String> al=new ArrayList<String>();
        //List al=new ArrayList();
        ArrayList al=new ArrayList();

        
        al.add("Hello");
            al.add(23);
            al.add('C');
            al.add(14.4);
            
            al.add(true);
        // for (Object obj: al) {
            
        //     System.out.println(al.get(0)); 
        // }
        System.out.println(al);  // [Hello, 23, C, 14.4, true]
        System.out.println(" No.of elements in ArrayList is " + al.size());   // No.of elements in ArrayList is 5
       

        //al.remove(3);
        // -------- OR ---------
        al.remove(14.4);
        System.out.println(al); //[Hello, 23, C, true]
        System.out.println(" No.of elements in ArrayList is " + al.size());  //No.of elements in ArrayList is 4

        // insert a new element at a particular index

        al.add(1," Python");
        System.out.println(al);  // [Hello,  Python, 23, C, true]

        // Retrieve specific element
       System.out.println(al.get(3)) ; // C

       // Replace element 
    //    al.set(1, "C#");
    //    System.out.println("After replacing 1 index" + al);  //[Hello, C#, 23, C, true]

       // Searching
       System.out.println(al.contains("C#")); // true
       System.out.println(al.contains("CPP")); // false

       // isEmpty()
    //    System.out.println(al.isEmpty());


       // Reading elements using different approaches

        // 1. For loop
    //    for(int i=0;i<al.size();i++){
    //     System.out.println(al.get(i));
    //    } 

       // ------- OR -------

    // 2. for each
    //    for(Object e:al){
    //     System.out.println(e);
    //    }

    // 3. iterator()
       Iterator it=al.iterator();
       while (it.hasNext()) {
        System.out.println(it.next()); // printing element and moves to the next 
       }

    }
}