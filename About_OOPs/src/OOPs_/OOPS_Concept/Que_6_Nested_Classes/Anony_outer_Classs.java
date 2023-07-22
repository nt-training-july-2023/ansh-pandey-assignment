package OOPs_.OOPS_Concept.Que_6_Nested_Classes;
abstract  class Anonymous_Inner_Class{
    abstract void run();
    abstract  void play();
}

public class Anony_outer_Classs {
    public static void main(String[] args) {
        Anonymous_Inner_Class Inner_Class = new Anonymous_Inner_Class() {
            @Override
            void run() {
                System.out.println("I  am running");
            }

            @Override
            void play() {
                System.out.println("I am playing");
            }
        };
        Inner_Class.run();
        Inner_Class.play();
    }

}
