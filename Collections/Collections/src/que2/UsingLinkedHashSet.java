package que2;

import java.util.LinkedHashSet;
import java.util.Random;

public class UsingLinkedHashSet {
    public static String RandomString(int length){
        String st = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<length;i++){
            int randomIndex =random.nextInt(st.length());
            char c =st.charAt(randomIndex);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
        for(int i=0;i<20;i++){
            String st = RandomString(8);
            linkedHashSet.add(st);
            System.out.println(st);
        }
        System.out.println(linkedHashSet);
        System.out.println("Number of string are : "+ linkedHashSet.size());
        //System.out.println( linkedHashSet.contains("VvewtULE"));

    }
}
