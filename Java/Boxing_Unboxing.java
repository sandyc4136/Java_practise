

public class Boxing_Unboxing {
    
    public static void main(String[] args) {
        // BOXING

        // int number=123;
        // String strNumber = Integer.toString(number);
        // System.out.println(strNumber);

        // OR

        int number=16776;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
        // System.out.println(strNumber.length());

        // UNBOXING

        int num=Integer.parseInt(strNumber);
        System.out.println(num);


        // NumberFormatException

        // String s="12Ab";
        // try{
        //     int n=Integer.parseInt(s);
        // }catch(NumberFormatException e){
        //     System.out.println(e);
        // }
        
        // String x[]={"Hi", " My name ", "Sandip CHhetry"};
        // String x[] = new String[]{"Shubham Gurung", "is  studying", "in class 10"};
        String[] x=new String[3];
            x[0]="I ";
            x[1]="am ";
            
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }

        String ss="string";
        ss="new String";  //  this will not update the SS variable in memmory but store the new value again in different space
        System.out.println(ss);
        
    }
}
