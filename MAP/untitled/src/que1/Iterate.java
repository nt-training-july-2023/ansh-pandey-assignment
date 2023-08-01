package que1;

import java.util.HashMap;
import java.util.Map;

public class Iterate {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        addEntry(map,1,"Ansh Pandey");
        addEntry(map,2,"Roushan Kumar");
        addEntry(map,3,"Anchal Sharma");

        for(Map.Entry<Integer,String> entry :map.entrySet()){
            System.out.println("key = "+ entry.getKey() +" Value = "+entry.getValue());
        }

    }
    public static  void addEntry(Map<Integer,String> employee, Integer integer,String string){

        employee.put(integer,string);

    }
}

