

 class Stack1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Stack s=new Stack();
        System.out.println(s.top);
        System.out.println(s.arr.length);
        Student s1 = new Student();
          s1.setMarks( 99 );
          s1.acceptRecord();
    }
}

class Stack{
    int top;
    int[] arr;
    {//Instance initialization block
        this.top = -1;
    }
    Stack( ){
        //this.top = -1;
        this.arr = new int[ 5 ];
        this.top+=1;
      }
      Stack( int size ){
        //this.top = -1;
        this.arr = new int[ size ];
    } }

    class Student{
        private String name;
        private int rollNumber;
        private float marks;
        public void setMarks( float marks ){
          if( marks > 100 )
            throw new IllegalArgumentException("Invalid marks.");
          this.marks = marks;
        }
        public void acceptRecord(){
            System.out.println("Marks: " + marks);
        }
      }
