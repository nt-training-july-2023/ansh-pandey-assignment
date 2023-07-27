package basicofjava.exercise6;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int Array[]= new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = S.nextInt();
        }
        // Print our array
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }



        // Rotating   Array by two times
        for (int i =0; i<2; i++){
            int b;
            // lets stores the last element of array
            b = Array[Array.length-1];
            for (int j=Array.length-1; j>0;j--){
                Array[j]= Array[j-1];
            }
            // now our last one is b
            Array[0] =b;

        }
        // Print new array
        for (int i = 0; i < Array.length; i++) {
            System.out.print( Array[i]);
        }


    }
}