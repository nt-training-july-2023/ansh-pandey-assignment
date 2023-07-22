import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner Sc = new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c;
        System.out.println("the arithmethic sum of a and b is "+ (a+b));
        System.out.println("the arithmethic subtraction of a and b is "+ (a-b));
        System.out.println("the arithmethic multiplication a and b is "+ a*b);
        System.out.println("the arithmethic division of a and b is "+ a/b);
        System.out.println("the arithmethic remainder of a and b is "+ a%b);


    }
}