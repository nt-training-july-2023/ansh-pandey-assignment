package que5;

class EachState  implements  Runnable{
    // Java program to demonstrate thread states

        public void run()
        {

            System.out.println("Good Morning");
            for (int i =0; i<=10; i++) {
                System.out.println(i);
                System.out.println(Thread.currentThread().getState());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getState());
                notify();
            }

        }
    }

    public class Main implements Runnable {


        public static void main(String[] args) throws InterruptedException {
           EachState m1 = new EachState();
             Thread t1 = new Thread(m1);

              Main m2 = new Main();
              Thread t2 = new Thread(m2);
              t1.setName("Thread1");
              t2.setName("Thread2");

            System.out.println(t1.getState());
            System.out.println(t1.getState());
              t1.start();
              t2.start();
            System.out.println(t1.getState());
            System.out.println(t1.getState());
               t1.join();
            System.out.println(t1.getState());
            System.out.println(t2.getState());

        }

        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getState());

        }
    }

