package que2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Crud {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        LinkedHashMap<Integer,String>map1 = new LinkedHashMap<>();
        TreeMap<Integer,String> map2= new TreeMap<>();

        // CRUD operations on HashMap
        addingHashMap(map,1,"Ansh");
        addingHashMap(map,2,"Alok");
        removeHashMap(map,1);
        updateHashMap(map,2,"Roushan");
        getHashMap(map,2);

        // crud Operations on LinkedHashMap
        addingLinkedHashMap(map1,1,"Ansh");
        addingLinkedHashMap(map1,2,"Alok");
        removeLinkedHashMap(map1,1);
        updateLinkedHashMap(map1,2,"Roushan");
        getLinkedHashMap(map1,2);
    }

    private static void getLinkedHashMap(LinkedHashMap<Integer, String> map1, int i) {
        map1.get(i);
    }

    private static void updateLinkedHashMap(LinkedHashMap<Integer, String> map, int i, String s) {
        map.put(i,s);
    }

    private static void removeLinkedHashMap(LinkedHashMap<Integer, String> map1, int i) {
    map1.remove(1);
    }


    private static void addingLinkedHashMap(LinkedHashMap<Integer, String> map1, int i, String s) {
        map1.put(i,s);
    }

    private static void getHashMap(HashMap<Integer,String> map,Integer I) {
        map.get(I);
    }

    private static void updateHashMap(HashMap<Integer,String> map,Integer I,String S) {
        map.put(I,S);
    }

    private static void removeHashMap(HashMap<Integer,String> map,Integer I) {
        map.remove(I);
    }

    private static void addingHashMap(HashMap<Integer,String> map,Integer I,String S) {
        map.put(I,S);
    }
}
