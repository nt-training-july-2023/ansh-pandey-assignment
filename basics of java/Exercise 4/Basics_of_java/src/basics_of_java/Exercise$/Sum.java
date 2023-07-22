package basics_of_java.Exercise$;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int sum =0;
        // to find the sum of first n natural number

        for (int i = 0; i < n; i++) {

            sum += i;

        }
        System.out.println(sum);
    }
}
