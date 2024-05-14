

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr3 = {-2,-3,-4,4,-2,-1,-3,1,5,-3,-4};
        findMaxSumSubarray(arr3);
    }

    // public static void findMaxSumSubarray(int arr[]){
    //     int maxSum=Integer.MIN_VALUE;
    //     int currentSum=0;
    //     int start = 0;
    //     int end = 0;
    //     int tempStart = 0;
    //     for(int i=0;i<arr.length;i++){
    //         currentSum+=arr[i];
    //         if(currentSum>maxSum){
    //             maxSum=currentSum;
    //             start = tempStart;
    //             end = i;

    //         }
    //         if(currentSum<0){
    //             currentSum=0;
    //             tempStart=i+1;
    //         }
            
    //     }
    //     System.out.println("Max Sum : " + maxSum + "  " + start + " " + end);
    // }

    public static void findMaxSumSubarray(int arr[]){

        for(int i=0;i<arr.length;i++){
            int maxSum=Integer.MIN_VALUE;
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
            }   
        }
    }
}
