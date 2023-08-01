package que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Store {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        for(int i =0;i<20;i++){
            list.add(i*5);
        }
        System.out.println(list);
         Collections.reverse(list);
        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>50)
            list.set(i, list.get(i)+5);
        }
        System.out.println(list);
    }
}
