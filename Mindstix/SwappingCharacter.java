import java.util.Arrays;
import java.util.Scanner;

public class SwappingCharacter {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // char[] input= new char[n];
        // String s=sc.nextLine();
        // for(int i=0;i<n;i++)
        // input[i]=sc.next().charAt(i);
        // // System.out.println(Arrays.toString(input));
        // for (int i = 0; i < input.length; i++) 
        // System.out.println(input[i]);

        //char[] input = {'a','b','c','e','E','C','B','A','$','x'};
        char[] input={'a','b','c','D','$','e','!','f'};
        int left=0;
        int right=input.length-1;
        while(left<right){
            if((input[left]>='a' && input[left]<='z' || input[right]>='A' && input[right]<='Z') &&
                (input[right] >= 'A' && input[right] <= 'Z' || input[right] >= 'a' && input[right] <= 'z'))
            {
                char temp=input[left];
                input[left]=input[right];
                input[right]=temp;
                left++;
                right--;
            }
            else{
                if(!(input[left]>='a' && input[left]<='z' || input[right]>='A' && input[right]<='Z')){
                    left++;
                }
                if(!(input[right] >= 'A' && input[right] <= 'Z' || input[right] >= 'a' && input[right] <= 'z'))
                right--;
            }
        }

        System.out.println("Output  " + Arrays.toString(input));
    }
}
