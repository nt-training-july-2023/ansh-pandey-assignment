package Thread_class;

class Sleep_state implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("print  state and this thread is after firat thread t1"+ Thread_state.t1.getState());
    }
}

public class Thread_state implements  Runnable{
    public  static Thread_state Ts;
    public  static Thread t1;
    @Override
    public void run() {
        Thread t2 = new Thread();
        System.out.println(" Thread state of t2 is "+ t2.getState());

        // after applying start it goes in to running state
        t2.start();
        System.out.println("after calling start method the state of thread 2 is "+t2.getState());
        try {
            Thread.sleep(105);
            System.out.println("after invoking the sleep method thread class of t2 is "+ t2.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //now applying join method
        try {
            t2.join();
            System.out.println("after invoking join method new state of t2 class is "+ t2.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("state of t1 after execute is "+t1.getState());


    }

    public static void main(String[] args) {
      Thread_state  Ts = new Thread_state();
      Thread t1 = new Thread(Ts);
        System.out.println("state of thread t1 is "+ t1.getState());
        t1.start();
        System.out.println("state of thread after start method is "+ t1.getState());
    }



}
