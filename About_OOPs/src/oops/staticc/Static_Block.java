package oops.staticc;

// In order to inititalize our static variable we have to create a static block


public class Static_Block {
    static String str ="A static variable";
    static float b = 4.23f;
    static float a;
    //static block to initialize any static variable
    static {
        System.out.println("now we can initialize a");
        a =45*b;
    }

    public static void main(String[] args) {
        System.out.println("print a "+a+" print b "+ b);

    }

}
