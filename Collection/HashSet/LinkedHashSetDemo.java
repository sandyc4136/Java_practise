import java.util.*;  
public class LinkedHashSetDemo{  
public static void main(String args[]){  
LinkedHashSet set=new LinkedHashSet<>();  

set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
// set.add(34);  
// set.add(76);  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  