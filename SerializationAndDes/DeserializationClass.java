package SerializationAndDes;

import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Emp em=null;
        try {
            FileInputStream fis=new FileInputStream("/Users/sandipchhetry/Library/Mobile Documents/com~apple~TextEdit/Documents/char.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            em= (Emp) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            System.out.println("Deserializing Object");
            System.out.println("Eployee name : "+ em.name);
            System.out.println("Eployee addres : "+ em.address);
        }
    }
}
