package que4;

class Message implements Runnable{
    String mess;
    public Message(String m) {
        mess = m;
    }

    @Override
    public void run(){
        System.out.println( "Print the message "+ mess);

    }
     public void method(){
        System.out.println("kjfn");
    }
}

public class Test implements  Runnable {

    public static void main(String[] args) {
    Test test = new Test();

    String mess = "Hello Everyone";
    Message m = new Message(mess);
        Thread t1 = new Thread(m);
    t1.start();
    }

    @Override
    public void run() {

    }
}
