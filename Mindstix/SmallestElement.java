

public class SmallestElement {
    public static void main(String[] args) {
        // int arr1[]={-3,10,-4,2,0,-2,3,7, 6};
        // int arr2[]={-2,7,3,-4,0,3,2};
        int arr1[]={4};
        int arr2[]={2};
        System.out.println("smallest element : "+ Duplicate(arr1,arr2));
        
    }
    public static int Duplicate(int arr1[],int arr2[]){
       // int smallest=Integer.MAX_VALUE; // OR
        int smallest=arr1[0];
        boolean found=false;
        for(int i=0;i<arr1.length;i++){
            found=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if(!found && arr1[i]<smallest){
                smallest=arr1[i];
            }
        }
        //return smallest==Integer.MAX_VALUE?-1:smallest;

         // OR 

        if(!found) return smallest;
            else return -1;
    }
}
