import java.util.HashMap;
import java.util.Set;

public class HashMapProg {
    public static void main(String[] args) {
        String str="Hello World";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }
        
    }
}
