// import java.util.Scanner;

// public class Max_And_SecondMax {
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number ");
//         // int n=sc.nextInt();
//         // int arr[]=new int[n];
        
//         // for(int i=0;i<n;i++){
//         //     arr[i]=sc.nextInt();
//         // }

//         int arr[]={15,10};
//         int max=Integer.MIN_VALUE;
//         int secondMax=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 secondMax=max;
//                 max=arr[i];
//             }
//             // else if (arr[i] > secondMax && arr[i] != max) {
//             //     secondMax = arr[i];
//             // }
            
//         }
//         System.out.println("Max element : " + max);
//         System.out.println("Second Max element : " + secondMax);
//     }
// }


import java.util.*;

public class Max_And_SecondMax
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// System.out.println("Enter a number");
		int n=4;
		int arr[]={10,4,9,2};
		if(arr.length<2)
		System.out.println("Error");
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		// for(int i=0;i<n;i++)
		// arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max)
				secondMax=arr[i];
		}
        System.out.println("lasrgest number : " + max);
        System.out.println("Second lasrgest number : " + secondMax);
	}

}