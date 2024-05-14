
class Complex{
    private int real; //
    private int imag;
    // static String s;
    public static int count;

    public Complex(int real, int imag ){
        System.out.println("inside constructor");
        this.real=real;
        this.imag=imag;
        
        // Complex.count=3;
    }

    public static void setStatic(){
        Complex.count=4;
        System.out.println(count);
    }
    public void getInstance(){
        System.out.println(real);
        System.out.println(imag);
    }

}

class ClassAndObject{
    public static void main(String[] args) {
        Complex c=new Complex(2,4);
        // System.out.println(c.real);
        // System.out.println(c.imag);

        c.setStatic();
        c.getInstance();
        //  System.out.println(Complex.count);

    }
}

