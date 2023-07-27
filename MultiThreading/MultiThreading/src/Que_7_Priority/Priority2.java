package Que_7_Priority;

 class Thread1 extends Thread{
     public void run(){
         System.out.println("Current thread name :"+ Thread.currentThread().getName()+ this.getPriority());
     }
 }

public class Priority2 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        Thread1 t4 = new Thread1();
        // setting the name
        t1.setName("first");
        t2.setName("second");
        t3.setName("third");
        t4.setName("fourth");
        // Setting the priority of the thread
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY-1);
        t4.setPriority(Thread.MIN_PRIORITY+1);
        // starting the thread

        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }


}
