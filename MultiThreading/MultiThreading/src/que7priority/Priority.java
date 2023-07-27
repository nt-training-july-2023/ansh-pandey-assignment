package que7priority;
class ThreadA extends  Thread{


    @Override
    public void run() {
        System.out.println("thread A is started");
           for(int i=0; i<=10;i++){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println( "value is "+ i + this.getName());
           }
        System.out.println("Here ends Thread A");

    }
}
class ThreadB extends  Thread{

    public  void run(){
        System.out.println("Thread B is started");
        for(int j=0; j<10;j++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("value is "+ j+ this.getName());
        }
        System.out.println("Here ends Thread B");
    }

}


public class Priority  {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.setName("Thread A");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.setName("Thread B");
        System.out.println("Thread 1 started");
        t1.start();
        System.out.println("Thread 2 started");
        t2.start();

    }


    }

