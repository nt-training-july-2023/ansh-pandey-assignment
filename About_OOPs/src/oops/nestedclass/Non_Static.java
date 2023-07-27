package oops.nestedclass;
// Non static inner class
 class Main {
    int a = 5;

    void run() {
        System.out.println("I'm Running");
    }


    class Inner {
//        Main.Inner inner_obj = new Main.Inner();
//        inner_obj.run();
        int  b=5;



    }

}
public class  Non_Static{

    public static void main(String[] args) {
        Main main = new Main();
        Main.Inner Innerobj = main.new Inner();
        System.out.println(Innerobj.b + main.a);

    }
}
