package OOPs_.OOPS_Concept.Que_6_Nested_Classes;

public class Outer {
    static int n =35;
    public  static  void display(){
        System.out.println(n);

    }
    // static INNER class
    // access all outer class variables
    //cannot access non static method,and variables of outer class
    static class inner{
         void inner(){
             System.out.println("This is inner Class");
        }


    }

    public static void main(String[] args) {
        Outer.display();
        System.out.println(Outer.n);
        Outer.inner inner= new Outer.inner();
        inner.inner();

    }
}
