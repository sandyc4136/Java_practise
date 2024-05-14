

public class Palindrome {
    public static void main(String[] args) {
        String s="Madam";
        String s1="";
        for(int i=0, j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                System.out.println("not palindrome");
        }
    }
}
