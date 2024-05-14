public class String_compare{
    public static void main(String[] args) {
        String str="new";
		String str1="new1";
		
		
		// first approach
// 		if(str.equals(str1)){
// 		    System.out.println("Same");
// 		}
//         else{
// 		    System.out.println("Different");
// 		}
		
		//Second approach
//         if(str==str1){
//             System.out.println("Same");
//         }
//         else{
// 		    System.out.println("Different");
// 		}
        
        // Third approach 
        if(str.compareTo(str1)==0){
            System.out.println("Same");
        }
		else{
		    System.out.println("Different");
		} 
    }
}