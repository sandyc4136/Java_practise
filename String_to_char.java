import java.util.Scanner;

public class String_to_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the String");
        str=sc.nextLine();
        //char ch[]=new char[str.length()];
        // for(int i=0;i<str.length();i++){
        //     ch[i]=str.charAt(i);
        // }
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            System.out.println(ch[i]);
        }
    }
}
