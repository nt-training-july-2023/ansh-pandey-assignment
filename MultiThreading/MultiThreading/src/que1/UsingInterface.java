package que1;

public class UsingInterface implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     UsingInterface t1 =new UsingInterface();

     Thread thread= new Thread(t1);
     thread.start();
    }
}
