package oops.inheritance;

 class Human {
    boolean eat(){
        System.out.println("Human eat to live");
        return false;
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
class Transgender extends Human implements Different {
    @Override
    public void diff() {
        System.out.println("They r diff");
    }

    @Override
    public boolean eat() {
        System.out.println("They also eat");
        return false;
    }
}
// multilevel Inheritance
  class women extends female{
     void married(){
         System.out.println("They r generally married");
     }
}
  public class Inheritance {
      public static void main(String[] args) {
        women w =new women();
         w.flexible();
      }
  }
