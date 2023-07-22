import java.util.Scanner;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        System.out.println("area of triangle ");
        Scanner S = new Scanner(System.in);
        float height =S.nextFloat();
        float base = S.nextFloat();
        float area = (height*base)/2;
        System.out.println("The area of triangle is  "+ area);
    }
}