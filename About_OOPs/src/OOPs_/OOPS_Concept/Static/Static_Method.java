package OOPs_.OOPS_Concept.Static;
// Any method that uses the static keyword is referred to as a static method
public class Static_Method {
    static String str = "Good Evening all";
    static float num = 89;
    int num2 =67;
    // Static Method for this
    static void print(){
        System.out.println("static string is " +str);
        System.out.println("Static number is " + num);
    }

    // non -static method
    void non_static(){
        System.out.println("This is a non static method");
    }
    public static void main(String[] args) {
        print();
        // Non static method cannot be refrenced as a from a stattic context
      //  non_static();
        // for that
        Static_Method s = new Static_Method();
        s.non_static();


    }
}
