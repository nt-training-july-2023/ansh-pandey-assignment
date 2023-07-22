package basics_of_java.Exercise$;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact *=i;

        }
        System.out.println(fact);
    }
}
