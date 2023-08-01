package que5;

import java.util.HashMap;
import java.util.Map;

public class Keysprinting {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ansh");
        map.put(2,"Alok");
        map.put(3,"Roushan");
        map.put(4,"Anchal");
        for(Map.Entry<Integer,String >entry: map.entrySet()){
            System.out.println("key "+ entry.getKey()+" value "+entry.getValue());
        }
    }
}
