package Que_3_Inheritance;

 class Human {
    void eat(){
        System.out.println("Human eat to live");
    }
}
// single inheritance
class Male extends Human{
     void Physically_Strong(){
         System.out.println("mens are physically strong");
     }
}
class female extends  Human{
     void flexible(){
         System.out.println("female are flexible");
     }
}
// Multiple inheritance
 interface Different{
     void diff();
}
class Transgender implements Different,  Human{
    @Override
    public void diff() {
        System.out.println("They r diff");
    }

    @Override
    public void eat() {
        System.out.println("They also eat");
    }
}
  public class Inheritance {
      public static void main(String[] args) {

      }
  }
