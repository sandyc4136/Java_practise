public class AnagramCheck {
    public static boolean check(String str1,String str2){
        if(str1.length()!=str2.length())
        return false;
        int freq[]=new int[256];
       
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            freq[c]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            freq[c]--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
             return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="liSten";
        String str2="Silent";
        if(check(str1, str2)){
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        }else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
        
    }
}
