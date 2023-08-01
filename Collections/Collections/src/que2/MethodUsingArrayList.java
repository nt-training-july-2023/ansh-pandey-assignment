package que2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class MethodUsingArrayList {
    public static  String generateRandom(int length) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuilder sB = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
           int randomIndex = random.nextInt(charSet.length());
           char randomChar = charSet.charAt(randomIndex);
           sB.append(randomChar);
        }
        return  sB.toString();
    }

    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       int elements = 20;
       int stringLength = 8;
       for(int i=0; i<elements;i++){
           String randomString = generateRandom(stringLength);
           System.out.println(randomString);
           list.add(randomString);
       }
        System.out.println(list);

    }
}
