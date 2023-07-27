package Que_2;

class Thread2 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Thread2 "+i);
        }
    }
}
class Thread_3 implements Runnable{
    @Override
    public void run(){
        for (int i =0;i<=10;i++){
            System.out.println("Thread 3 " +i);
        }
    }
}
public class Check_running_threads implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println("print "+i);
        }

    }

    public static void main(String[] args) {
        Check_running_threads c = new Check_running_threads();
        Thread2 c2 = new Thread2();
        Thread_3 c3 = new Thread_3();
        Thread t1 = new Thread(c);
        Thread t2= new Thread(c2);
        Thread t3 = new Thread(c3);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        // starting them
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());




    }
}
