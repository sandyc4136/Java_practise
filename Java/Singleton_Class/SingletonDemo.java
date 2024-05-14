

// class Singleton{
//     private Singleton( ){
//   //TODO
//     }
//     private static Singleton reference;
//     public static Singleton getReference( ){
//       if( reference == null )
//         reference = new Singleton( );
//       return reference;
//     }
//   }
//   class SingletonDemo{
//     public static void main(String[] args) {
//       Singleton s1 = Singleton.getReference();
//       Singleton s2 = Singleton.getReference();
//       System.out.println(s1);
//       System.out.println(s1.hashCode());
//   } }

  // 2nd way

  class Singleton{
    private int num1;
    private int num2;
    private static Singleton reference;
    static{
      reference = new Singleton();
    }
    public static Singleton getReference() {
      return reference;
    }
    private Singleton( ){
      this.num1 = 10;
      this.num2 = 20;
    }
  }
  class SingletonDemo{
    public static void main(String[] args) {
      Singleton s1 = Singleton.getReference();
      Singleton s2 = Singleton.getReference();
      System.out.println(s1.equals(s2));
      ;
  } }