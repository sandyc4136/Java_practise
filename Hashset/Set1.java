

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        // HashSet set = new HashSet<>();

        // set.add(3);
        // set.add(5);
        // set.add(9);
        // set.add(1);

        // Iterator it=set.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // int arr[]={1,2,3,4};
        try{
            String str="";
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            // int i=br.read();
            // System.out.println(" Hello I am i = " + i);
            str=br.readLine();
            System.out.println("Hello I am String = " + str);
        }
        
        catch(Exception e){}
    }
    
}
