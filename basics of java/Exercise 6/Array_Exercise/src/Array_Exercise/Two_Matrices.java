package Array_Exercise;

import java.util.Scanner;

public class Two_Matrices {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num1 = S.nextInt();
        int num2 = S.nextInt();

        int arr1[][] = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = S.nextInt();
            }
        }
        // print matrices
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int arr2[][] = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr2[i][j] = S.nextInt();
            }
        }
        // print matrices 2
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int addTwoMatrices[][] = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                addTwoMatrices[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }

        // print result
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(addTwoMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}
