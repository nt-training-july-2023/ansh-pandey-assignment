package basicofjava.exercise4;

import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( N+ "*"+i + " = "+ N*i);
        }
    }
}
