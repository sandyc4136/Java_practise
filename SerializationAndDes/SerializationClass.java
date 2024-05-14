package SerializationAndDes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.address="Odisha";
        emp.name="Sandip Chhetry";
        try{
            FileOutputStream fos=new FileOutputStream("/Users/sandipchhetry/Library/Mobile Documents/com~apple~TextEdit/Documents/char.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Serialized data is stored in char.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
