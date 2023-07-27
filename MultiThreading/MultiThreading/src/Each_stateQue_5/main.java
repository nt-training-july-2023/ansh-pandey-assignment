package Each_stateQue_5;

 class Each_state  implements  Runnable{
    // Java program to demonstrate thread states

        public void run()
        {
            // moving thread2 to timed waiting state
            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException e) {
               e.getMessage();
            }

            System.out.println(
                    "State of thread1 while it called join() method on thread2 -"
                            + Test.thread1.getState());
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class main implements Runnable {
        public static Thread t1;
        public static main m;

        public static void main(String[] args)
        {
            m= new main();
            t1 = new Thread(m);

            // thread1 created and is currently in the NEW
            // state.
            System.out.println(
                    "State of thread1 after creating it - "
                            + t1.getState());
            t1.start();

            // thread1 moved to Runnable state
            System.out.println(
                    "State of thread1 after calling .start() method on it - "
                            + t1.getState());
        }

        public void run()
        {
            main ma= new main();
            Thread t2 = new Thread(ma);

            // thread2 created and is currently in the NEW
            // state.
            System.out.println(
                    "State of thread2 after creating it - "
                            + t2.getState());
            t2.start();

            // thread2 moved to Runnable state
            System.out.println(
                    "State of thread2 after calling .start() method on it - "
                            + t2.getState());

            // moving thread1 to timed waiting state
            try {
                // moving thread1 to timed waiting state
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "State of thread2 after calling .sleep() method on it - "
                            + t2.getState());

            try {
                // waiting for thread2 to die
                t2.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "State of thread2 when it has finished it's execution - "
                            + t2.getState());
        }
    }

