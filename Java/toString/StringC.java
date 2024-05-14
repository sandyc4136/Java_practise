
class StringC{  
    int rollno;  
    String name;  
    String city;  
     
    StringC(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
    public String toString(){//overriding the toString() method  
        return rollno+" "+name+" "+city;  
       }  
     
    public static void main(String args[]){  
        StringC s1=new StringC(101,"Raj","lucknow");  
        StringC s2=new StringC(102,"Vijay","ghaziabad");  
        
      System.out.println(s1.toString());//compiler writes here s1.toString()  
      System.out.println(s2);//compiler writes here s2.toString()  
    }  
   }  