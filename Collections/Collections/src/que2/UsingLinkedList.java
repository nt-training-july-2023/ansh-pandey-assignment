package que2;

import java.util.LinkedList;
import java.util.Random;

public class UsingLinkedList {
    public  static String generateRandom(int length){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sB1= new StringBuilder();
        Random random =new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(str.length());
            char ch = sB1.charAt(randomIndex);
            sB1.append(ch);
            System.out.println(sB1);
        }
        return sB1.toString();
    }
    public static void main(String[] args) {

    LinkedList<String> list1 = new LinkedList<>();
        int length =8;


    for(int i=0; i<20;i++) {
        System.out.println("Hello");
        String randomString = generateRandom(length);
        list1.add(randomString);
    }
        System.out.println(list1);

    }
}
