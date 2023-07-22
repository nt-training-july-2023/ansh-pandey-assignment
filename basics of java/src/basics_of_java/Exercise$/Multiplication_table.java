package basics_of_java.Exercise$;

import java.util.Scanner;

public class Multiplication_table {


    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( N+ "*"+i + " = "+ N*i);
        }
    }
}
