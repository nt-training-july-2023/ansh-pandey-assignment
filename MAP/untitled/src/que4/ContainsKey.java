package que4;

import java.util.HashMap;

public class ContainsKey {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
//    map
        map.put(1,"Ansh");
        map.put(2,"Alok");
        map.put(3,"Anchal");
        System.out.println("Initial Mappings are "+ map);
        //Checking for the element key
        System.out.println( map.containsKey(2));
        // checking the value
        System.out.println(map.containsValue("Ansh"));

    }
}