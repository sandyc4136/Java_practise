import java.util.*;

public class SelectionSort {
    // public static void main(String[] args) {
    //     int arr[]={2,0,1,8,3,6,5,2,4, -1,-8};
    //     int n=arr.length;
    //     int min=arr[0];
    //     for(int i=0;i<n-1;i++){
    //         // int minIndex = i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]<arr[i]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[i];
    //                 arr[i]=temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    public static void main(String[] args) {
        int arr[] = {2,0,1,8,3,6,5,2,4, -1,-8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of unsorted array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
