package que3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Threshold {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        int Threshold =0;
        Scanner Sc = new Scanner(System.in);
       Threshold = Sc.nextInt();
       map.put(1,"A");
       map.put(2,"AB");
       map.put(3,"ABC");
       map.put(4,"ABCD");
       map.put(5,"ABCDE");
       map.put(6,"ABCDEF");
       map.put(7,"ABCDEFG");
       map.put(8,"ABCDEFGH");
       printAndClear(map,Threshold);



    }

    private static void printAndClear(HashMap<Integer,String > map,int t) {
        if(map.size()>=t){
            for(Map.Entry<Integer,String> entry:map.entrySet() ){
                System.out.println("key "+ entry.getKey() +" value "+entry.getValue());
            }
        }



    }
}
