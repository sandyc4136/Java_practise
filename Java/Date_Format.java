import java.text.SimpleDateFormat;
import java.util.*;

public class Date_Format {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        String str=sdf.format(date);
       
        
        System.out.println(str);
    }
}
