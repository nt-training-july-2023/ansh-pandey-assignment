package que6;

import java.util.*;

public class RemovingKeyValue {
    public static void main(String[] args) {
        Map<Integer,String > map = new HashMap<Integer,String >();
        map.put(1,"Ansh");
        map.put(2,"Alok");
        map.put(4,"Yogesh");
        System.out.println(map);
        Scanner S = new Scanner(System.in);

        String sc = S.next();
        removeKey(map,sc);
        System.out.println(map);

    }

    private static void removeKey(Map<Integer,String> mapp,String value) {
        List<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer,String> entry: mapp.entrySet())
       {
         // System.out.println(entry.getKey());

           if(entry.getValue().equals(value)){
               list.add(entry.getKey());
               System.out.println(list);
           }
       }
       for(Integer i:list){
           mapp.remove(i);
       }

    }
}
