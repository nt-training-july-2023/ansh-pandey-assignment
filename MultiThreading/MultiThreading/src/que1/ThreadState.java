package que1;

class SleepState implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 2 is starting "+ Thread.currentThread().getState());

    }
}

public class ThreadState implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 is starting");
        for(int i =0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getState());
        }
    };



    public static void main(String[] args) {
      ThreadState  Ts = new ThreadState();
      SleepState Ss = new SleepState();
      Thread t1 = new Thread(Ts);
      Thread t2 = new Thread(Ss);

        System.out.println("state of thread t1 is "+ t1.getState());
        t1.start();
        System.out.println("state of thread after start method is "+ t1.getState());
         t2.start();
        System.out.println("state of thread after start method is "+ t2.getState());
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



}
