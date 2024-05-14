package StringPalindrome;


// public class StringRecursion {
//     public static boolean IsRecursive(String str){

    // base case
//         if(str.length()<=1){
//             return true;
//         }
//         if(str.charAt(0)!=str.charAt(str.length() - 1)){
//             return false;
//         }
//         return IsRecursive(str.substring(1, str.length() - 1));
//     }
//     public static void main(String[] args) {
//         String s="Madam";
        
//         System.out.println(IsRecursive(s));
//     }
// }

public class StringRecursion {
    public static void main(String[] args) {
                String s="MadaM";
                String revString="";
                int len=s.length();
                // for(int i=0;i<s.length();i++){
                //    revString = s.charAt(i) + revString;
                // }

                for(int i=s.length()-1;i>=0;i--){
                    revString+=s.charAt(i);
                }

                 if(revString.equals(s))
                // if(revString==s)
                    System.out.println("Palindrome");
                else
                System.out.println("Not Palindrome");
            }
}

// public class StringRecursion {
//     public static void main(String[] args) {
//                 String s="MadaM";
//                 boolean isPalindrome=true;
//                 int len=s.length();
//                 for(int i=0,j=len-1;i<j;i++,j--){
//                     if(s.charAt(i)!=s.charAt(j)){
//                         isPalindrome=false;
//                         break;
//                     }
//                 }
               
//                 if(isPalindrome)
//                     System.out.println("Palindrome");
//                 else
//                 System.out.println("Not Palindrome");
//             }
// }