package que3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Display implements Runnable{
    int a;
    public Display( int n) {
        a =n;
    }


    @Override
    public void run(){
        // printing all no . b/w 1 to 10
        for(int i=1;i<a;i++){
            System.out.println(i);
        }
    }
}

class Fibonacci implements Runnable{


    @Override
    public void run(){
        for(int i=0;i<10;i++) {
            int n1 = 0;
            int n2 = 1;
            int n3;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" " + n3);
        }

    }
}
class ReversingList implements Runnable{
    List<Integer> rev = new ArrayList<>();
    public ReversingList(List<Integer> l) {
        super();
        rev =l;
    }

    @Override
    public void run(){
        Collections.reverse(rev);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(rev);

    }
}
public class Que3 {
    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(44);
        list.add(42);
        list.add(444);
        System.out.println("Before reversing " + list);
        ReversingList obj = new ReversingList(list);
        Display obj2 = new Display(10);
        Fibonacci obj3 = new Fibonacci();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();




    }
}