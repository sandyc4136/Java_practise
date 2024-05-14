import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("Dog");
        l.add("Dog");
        l.add("Cat");
        l.add("Horse");

        // Before adding any new elements
        System.out.println(l); //[Dog, Dog, Cat, Horse]

        l.addFirst("Tiger");
        l.addLast("Elephant");

        // after adding new elements first and last
        System.out.println(l); // [Tiger, Dog, Dog, Cat, Horse, Elephant]

        // Retrieve the elements
        System.out.println(l.getFirst()); //Tiger
        System.out.println(l.getLast()); // Elephant

        // Remove
        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first and last element" + l) ;
    }
}
