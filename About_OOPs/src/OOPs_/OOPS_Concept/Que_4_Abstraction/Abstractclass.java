package OOPs_.OOPS_Concept.Que_4_Abstraction;
abstract class Parent{
    public void method(){
        System.out.println("They are Strict");
    }
    public abstract void thought();

}
class child1 extends Parent{
    void Respect (){
        System.out.println("they always respect parents");
    }

    @Override
    public void thought() {
        System.out.println("think good");
    }
}


public class Abstractclass {
    public static void main(String[] args) {
        child1 c = new child1();
        c.method();
        c.Respect();
        c.thought();

    }
}