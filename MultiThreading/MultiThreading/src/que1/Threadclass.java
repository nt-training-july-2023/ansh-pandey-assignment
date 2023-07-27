package que1;

// By using thread class extend
public class Threadclass extends  Thread {
    public void run() {
        // task for thread

        try {
            Thread.sleep(2000);
            System.out.println(" this is first thread " + this.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Threadclass t1 = new Threadclass();
        // Thread new state
        System.out.println(t1.getState());
        // starting the thread
        t1.start();
        // thread runnable state
        System.out.println(t1.getState());
        System.out.println( Thread.currentThread().getState());
        try {
            Thread.sleep(1000);
            System.out.println("state after sleep is  : " + t1.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());

        System.out.println("All threads are compelete");

    }
}


